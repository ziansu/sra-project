public boolean goBack() {
    if ((null == (mActivity)) || (mActivity.mStateSaved)) {
        return false;
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