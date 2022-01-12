public lpweb.com.monvelib.model.User getUserDetails() {
    lpweb.com.monvelib.model.User user = new lpweb.com.monvelib.model.User(pref.getInt(lpweb.com.monvelib.util.SessionManager.KEY_ID, 0), pref.getString(lpweb.com.monvelib.util.SessionManager.KEY_LOGIN, null), pref.getString(lpweb.com.monvelib.util.SessionManager.KEY_EMAIL, null), pref.getString(lpweb.com.monvelib.util.SessionManager.KEY_PASSWORD, null), pref.getBoolean(lpweb.com.monvelib.util.SessionManager.KEY_ACTIVE, false));
    return user;
}