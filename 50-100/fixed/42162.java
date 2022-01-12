@java.lang.Override
protected void onPart(java.lang.String channel, java.lang.String sender, java.lang.String login, java.lang.String hostname) {
    channel = channel.toLowerCase(java.util.Locale.ENGLISH);
    sender = sender.toLowerCase(java.util.Locale.ENGLISH);
    if (sender.equals(getNick().toLowerCase(java.util.Locale.ENGLISH))) {
        getUserLists().remove(channel);
    }else {
        getUserLists().get(channel).remove(sender);
    }
}