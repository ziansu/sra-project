private boolean needsRun() {
    long maxAge = (java.lang.System.currentTimeMillis()) - ((simpleserver.thread.AutoRun.MILLISECONDS_PER_MINUTE) * (server.config.properties.getInt("c10tMins")));
    return ((server.config.properties.contains("c10tArgs")) && (maxAge > (lastRun))) && ((server.numPlayers()) > 0);
}