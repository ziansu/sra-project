@java.lang.Override
public void onActivityResumed(android.app.Activity activity) {
    if (activity != (mActivity)) {
        return ;
    }
    if (((mPresenting) && ((gvrLayout) != null)) && (!(mGvrResumed))) {
        gvrLayout.onResume();
        mGvrResumed = true;
    }
}