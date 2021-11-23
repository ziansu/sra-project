public static void loadUserSession(android.content.Context context) {
    android.content.SharedPreferences savedSession = context.getSharedPreferences(com.bridginggood.UserSessionStore.KEY, Context.MODE_PRIVATE);
    com.bridginggood.UserInfo.setTokenString(savedSession.getString(com.bridginggood.UserSessionStore.TOKEN, null));
    com.bridginggood.UserInfo.setUserType(savedSession.getString(com.bridginggood.UserSessionStore.USER_TYPE, null));
    com.bridginggood.UserInfo.setDeviceId(savedSession.getString(com.bridginggood.UserSessionStore.DEVICE_ID, null));
    com.bridginggood.UserInfo.setC2DMRegistrationId(savedSession.getString(com.bridginggood.UserSessionStore.C2DM_REGISTRATION_ID, null));
    com.bridginggood.UserInfo.setFirstTimeOnThisDevice(savedSession.getBoolean(com.bridginggood.UserSessionStore.IS_FIRST, true));
}