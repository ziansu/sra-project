public void onReceiveTransientParamsImpl(@android.support.annotation.NonNull
V v, @android.support.annotation.Nullable
android.os.Bundle params) {
    allowScreenViewCalls = true;
    v.onReceiveParams(params);
    allowScreenViewCalls = false;
    VP presenter = getPresenter(v);
    if (presenter != null) {
        presenter.onReceiveTransientParams(v, params);
    }
}