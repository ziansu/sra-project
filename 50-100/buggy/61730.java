private void logoutUser() {
    session.setLogin(false);
    db.deleteUsers();
    android.util.Log.d(materialtest.theartistandtheengineer.co.materialtest.materialtest.ActivityUsingTabLibrary.class.toString(), "Logging out of messaging");
    stopService(new android.content.Intent(getApplicationContext(), materialtest.theartistandtheengineer.co.materialtest.helper.MessageService.class));
    com.parse.ParseUser.logOut();
    android.content.Intent intent = new android.content.Intent(this, materialtest.theartistandtheengineer.co.materialtest.LoginActivity.class);
    startActivity(intent);
    finish();
}