private void stopZookeeperConnection() {
    cache.close();
    failover.close();
    zookeeperStorage.close();
}