public void addToList(java.lang.String serverId, com.mb3364.twitch.api.models.Stream stream) {
    ovh.gyoo.bot.data.StreamInfo streamInfo = new ovh.gyoo.bot.data.StreamInfo(stream.getChannel().getName(), stream.getGame(), stream.getChannel().getStatus());
    synchronized(online.get(serverId)) {
        online.get(serverId).add(streamInfo);
    }
}