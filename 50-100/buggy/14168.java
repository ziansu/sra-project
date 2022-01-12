public boolean goBack() {
    if ((null == (mActivity)) || (mActivity.mStateSaved)) {
        return false;
    }
    if (mShouldFallBackToAppsHome) {
        gotoHome();
        mShouldFallBackToAppsHome = false;
        return true;
    }
    try {
        mBackStack.pop();
        mFragmentManager.popBackStack();
        mBackStack.peek();
        return true;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
}