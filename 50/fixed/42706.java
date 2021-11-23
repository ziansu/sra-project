public static void storeRecipientId(android.content.Context context, java.lang.String recipientId) {
    com.silverpop.engage.config.EngageConfig.getConfigSharedPrefs(context).edit().putString(com.silverpop.engage.config.EngageConfig.SharedProperties.RECIPIENT_ID.toString(), recipientId).commit();
}