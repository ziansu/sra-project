@java.lang.Override
public void OnClick(android.view.View view, android.app.Dialog dialog) {
    com.example.codenamebiscuit.UserAccount.deleteCache(this);
    dialog.dismiss();
    if ((com.facebook.login.LoginManager.getInstance()) != null)
        com.facebook.login.LoginManager.getInstance().logOut();
    
    if (com.example.codenamebiscuit.helper.App.getGoogleApiHelper().isConnected())
        com.example.codenamebiscuit.helper.App.getGoogleApiHelper().disconnect();
    
    android.content.Intent intent = new android.content.Intent(this, com.example.codenamebiscuit.login.ChooseLogin.class);
    startActivity(intent);
}