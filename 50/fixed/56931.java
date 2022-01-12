public static void storeAppInstalled(android.content.Context context, java.lang.String appInstalled) {
    com.silverpop.engage.config.EngageConfig.getConfigSharedPrefs(context).edit().putString(com.silverpop.engage.config.EngageConfig.SharedProperties.APP_INSTALLED.toString(), appInstalled).commit();
}