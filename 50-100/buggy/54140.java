@java.lang.Override
public void onClick(android.view.View v) {
    loginPrefsEditor.putBoolean("saveLogin", true);
    loginPrefsEditor.putString("username", mSignInData.getPhone());
    loginPrefsEditor.putString("passwd", mSignInData.getPasswd());
    loginPrefsEditor.putString("logintype", uType);
    loginPrefsEditor.apply();
    dialog.dismiss();
    processLogin();
}