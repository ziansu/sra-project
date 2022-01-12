public com.winthier.chat.Channel getFocusChannel(java.util.UUID uuid) {
    java.lang.String channelName = com.winthier.chat.sql.SQLSetting.getString(uuid, null, "FocusChannel", "g");
    return findChannel(channelName);
}