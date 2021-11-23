public void logoutUser() {
    session.setLogin(false);
    db.deleteUsers();
    android.content.Intent intent = new android.content.Intent(this, app.com.cvjuanresume.juansandoval.cvjuanresume.LoginActivity.class);
    finish();
    startActivity(intent);
}