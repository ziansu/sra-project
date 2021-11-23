public java.util.HashMap<java.lang.String, java.lang.String> getUserDetails() {
    java.util.HashMap<java.lang.String, java.lang.String> user = new java.util.HashMap<java.lang.String, java.lang.String>();
    user.put(edu.scu.levelup.UserSessionManager.key_name, pref.getString(edu.scu.levelup.UserSessionManager.key_name, null));
    user.put(edu.scu.levelup.UserSessionManager.key_email, pref.getString(edu.scu.levelup.UserSessionManager.key_email, null));
    return user;
}