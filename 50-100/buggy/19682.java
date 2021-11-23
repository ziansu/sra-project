public static void logout() {
    Data.loggedInFlag = 0;
    com.facebook.login.LoginManager loginManager = com.facebook.login.LoginManager.getInstance();
    loginManager.logOut();
    if ((Data.gps) != null)
        Data.gps.destroyListener();
    
    if ((Data.client) != null)
        Data.client.closeSocket();
    
    Data.client = null;
    android.widget.Toast.makeText(Data.mainAct.getApplicationContext(), "Logout", Toast.LENGTH_SHORT).show();
}