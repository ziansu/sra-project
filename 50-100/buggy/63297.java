public static java.lang.String getMessage(java.lang.String key, long guildId) {
    java.lang.String lang = com.cloudcraftgaming.discal.database.DatabaseManager.getManager().getSettings(guildId).getLang();
    java.util.Map<java.lang.String, java.lang.String> messages;
    if ((lang != null) && (com.cloudcraftgaming.discal.utils.MessageManager.langs.containsKey(lang))) {
        messages = com.cloudcraftgaming.discal.utils.MessageManager.langs.get(lang);
    }else {
        messages = com.cloudcraftgaming.discal.utils.MessageManager.langs.get("ENGLISH");
    }
    return messages.getOrDefault(key, "***FAILSAFE MESSAGE*** MESSAGE NOT FOUND!!").replaceAll("%lb%", Message.lineBreak);
}