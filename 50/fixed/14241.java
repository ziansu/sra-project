public void onBackPressed() {
    if ((popup_window) != null) {
        dismissPopup();
        return ;
    }
    super.onBackPressed();
}