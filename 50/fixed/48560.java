public void dismiss() {
    if (dismissed)
        return ;
    
    dismissed = true;
    if ((mPopupWindow) != null) {
        mPopupWindow.dismiss();
    }
}