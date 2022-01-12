public void onReceiveTransientParamsImpl(@android.support.annotation.NonNull
V v, @android.support.annotation.Nullable
android.os.Bundle params) {
    VP presenter = getPresenter(v, false);
    allowScreenViewCalls = true;
    v.onReceiveParams(params);
    allowScreenViewCalls = false;
    if (presenter != null) {
        presenter.onReceiveTransientParams(v, params);
    }
}