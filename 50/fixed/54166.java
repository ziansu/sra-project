@java.lang.Override
protected void beforeTestsStarted() throws java.lang.Exception {
    super.beforeTestsStarted();
    int cnt = gridCount();
    assert cnt >= 1 : "At least one grid must be started";
    initStoreStrategy();
    startGrids(cnt);
    awaitPartitionMapExchange();
}