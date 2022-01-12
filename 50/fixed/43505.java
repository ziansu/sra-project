private void pause(IChannel channel, boolean pause) {
    getPlayer(getGuild(channel)).setPaused(pause);
}