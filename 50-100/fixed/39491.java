protected void dismissPopup(boolean itemSelected) {
    if (((mContentView) != null) && ((modalWindow) != null)) {
        ((android.view.ViewGroup) (mContentView.getParent())).removeView(mContentView);
        ((android.view.ViewGroup) (modalWindow.getParent())).removeView(modalWindow);
        if ((!itemSelected) && ((this.mOnDismissCallback) != null)) {
            mOnDismissCallback.call();
            this.mOnDismissCallback = null;
        }
    }
}