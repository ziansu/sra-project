@java.lang.Override
public void process(org.apache.zookeeper.WatchedEvent watchedEvent) {
    io.shuidi.snowflake.server.SnowflakeServer.LOGGER.info(java.lang.String.format("%s/%s/%s", watchedEvent.getPath(), watchedEvent.getState(), watchedEvent.getType()));
    if (isLeader()) {
        if ((watchedEvent.getState()) == (Event.KeeperState.Disconnected)) {
        }else
            if ((watchedEvent.getState()) == (Event.KeeperState.SyncConnected)) {
                callback();
            }
        
    }
}