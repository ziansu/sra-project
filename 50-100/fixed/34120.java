@java.lang.Override
public void OnClick(android.view.View view, android.app.Dialog dialog) {
    if ((com.facebook.login.LoginManager.getInstance()) != null)
        com.facebook.login.LoginManager.getInstance().logOut();
    else {
        com.example.codenamebiscuit.helper.App.getGoogleApiHelper().disconnect();
    }
    startActivity(intent);
    dialog.dismiss();
}