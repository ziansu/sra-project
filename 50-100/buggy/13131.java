@java.lang.Override
protected void onJoin(java.lang.String channel, java.lang.String sender, java.lang.String login, java.lang.String hostname) {
    java.lang.System.out.println(("onJoin(): " + sender));
    channel = channel.toLowerCase(java.util.Locale.ENGLISH);
    sender = sender.toLowerCase(java.util.Locale.ENGLISH);
    if (!(sender.equals(getNick().toLowerCase(java.util.Locale.ENGLISH)))) {
        getUserLists().get(channel).add(sender);
    }
}