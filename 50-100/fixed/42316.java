public void createLoginSession(java.lang.String name, money.mezu.mezu.UserIdentifier id, java.lang.String logInType, java.lang.String email, android.net.Uri image) {
    editor.putBoolean(money.mezu.mezu.SessionManager.IS_LOGIN, true);
    editor.putString(money.mezu.mezu.SessionManager.KEY_NAME, name);
    editor.putString(money.mezu.mezu.SessionManager.KEY_ID, id.getId().toString());
    editor.putString(money.mezu.mezu.SessionManager.KEY_LOGIN_TYPE, logInType);
    editor.putString(money.mezu.mezu.SessionManager.KEY_EMAIL, email);
    if (image != null)
        editor.putString(money.mezu.mezu.SessionManager.KEY_IMAGE, image.toString());
    
    editor.commit();
}