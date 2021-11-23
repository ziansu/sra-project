public void onBackPressed() {
    if ((popup_window) != null) {
        dismissPopup();
        dismissModePopup();
        return ;
    }
    super.onBackPressed();
}