@java.lang.Override
public void onBackPressed() {
    hideKeyboard();
    if (((searchPopupWindow) != null) && (searchPopupWindow.isShowing())) {
        searchPopupWindow.dismiss();
    }
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
    }else {
        super.onBackPressed();
    }
}