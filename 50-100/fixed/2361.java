@java.lang.Override
public void onBackPressed() {
    hideKeyboard();
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
        return ;
    }
    if (((searchPopupWindow) != null) && (searchPopupWindow.isShowing())) {
        searchPopupWindow.dismiss();
        return ;
    }
    super.onBackPressed();
}