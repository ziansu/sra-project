public void onClick(android.content.DialogInterface dialog, int id) {
    absenmobilehr.app.kalbenutritionals.absenmobilehr.Data.DatabaseHelper helper = absenmobilehr.app.kalbenutritionals.absenmobilehr.Data.DatabaseManager.getInstance().getHelper();
    helper.clearDataAfterLogout();
    helper.close();
    logout();
}