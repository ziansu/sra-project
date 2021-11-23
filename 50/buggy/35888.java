public void onLogoutClicked(android.view.View view) {
    de.dhbw.smar.helpers.LoginHelper.getInstance().setLogout();
    super.onBackPressed();
}