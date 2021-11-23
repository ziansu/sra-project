@java.lang.Override
protected void cleanup() {
    if ((_nextStart) < (java.lang.System.currentTimeMillis())) {
        updateDatabase();
        _nextStart += _downloadEvery;
    }
}