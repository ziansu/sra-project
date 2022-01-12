public static java.lang.String getMessage(java.lang.String key, com.cloudcraftgaming.discal.internal.data.GuildSettings settings) {
    java.util.Map<java.lang.String, java.lang.String> messages;
    if (((settings.getLang()) != null) && (com.cloudcraftgaming.discal.utils.MessageManager.langs.containsKey(settings.getLang()))) {
        messages = com.cloudcraftgaming.discal.utils.MessageManager.langs.get(settings.getLang());
    }else {
        messages = com.cloudcraftgaming.discal.utils.MessageManager.langs.get("ENGLISH");
    }
    return messages.getOrDefault(key, "***FAILSAFE MESSAGE*** MESSAGE NOT FOUND!!").replaceAll("%lb%", Message.lineBreak);
}