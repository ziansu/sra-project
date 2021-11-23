public static boolean saveUserSession(android.content.Context context) {
    android.content.SharedPreferences.Editor editor = context.getSharedPreferences(com.bridginggood.UserSessionStore.KEY, Context.MODE_PRIVATE).edit();
    editor.putString(com.bridginggood.UserSessionStore.TOKEN, com.bridginggood.UserInfo.getTokenString());
    editor.putString(com.bridginggood.UserSessionStore.USER_TYPE, com.bridginggood.UserInfo.getUserType());
    editor.putString(com.bridginggood.UserSessionStore.C2DM_REGISTRATION_ID, com.bridginggood.UserInfo.getC2DMRegistrationId());
    editor.putBoolean(com.bridginggood.UserSessionStore.IS_FIRST, false);
    return editor.commit();
}