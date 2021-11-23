public void showVirtualKeyboard() {
    if ((mLayoutManager.mFocusView) != null) {
        io.github.erehmi.library.util.IMMUtils.hideSoftInput(mContext, mLayoutManager.mFocusView);
    }
    mLayoutManager.showVirtualKeyboardView();
}