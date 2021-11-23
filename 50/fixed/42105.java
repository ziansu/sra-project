public static void storeSession(android.content.Context context, long session) {
    com.silverpop.engage.config.EngageConfig.getConfigSharedPrefs(context).edit().putLong(com.silverpop.engage.config.EngageConfig.SharedProperties.SESSION.toString(), session).commit();
}