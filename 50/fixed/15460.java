private void stopZookeeperConnection() {
    if ((cache) != null) {
        cache.close();
    }
    if ((failover) != null) {
        failover.close();
    }
    zookeeperStorage.close();
}