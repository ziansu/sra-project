private void clearPopup() {
    if ((mPopupMenu) != null) {
        if (mPopupMenu.isShowing())
            mPopupMenu.dismiss();
        
        mPopupMenu = null;
    }
}