public void showVirtualKeyboard() {
    mLayoutManager.showVirtualKeyboardView();
    if ((mLayoutManager.mFocusView) != null) {
        io.github.erehmi.library.util.IMMUtils.hideSoftInput(mContext, mLayoutManager.mFocusView);
    }
}