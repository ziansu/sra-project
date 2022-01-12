public android.os.Parcelable onSaveInstanceStateImpl(@android.support.annotation.NonNull
V v) {
    allowScreenViewCalls = true;
    android.os.Parcelable superState = v.saveState();
    allowScreenViewCalls = false;
    VP presenter = getPresenter(v);
    if (presenter != null) {
        android.os.Bundle b = new android.os.Bundle();
        b.putParcelable("___SUPER___", superState);
        presenter.onSaveInstanceState(v, b);
        return b;
    }
    return superState;
}