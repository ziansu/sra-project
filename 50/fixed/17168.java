public void setNetworkInterval(long newInterval) {
    PUSH_NETWORK_INTERVAL = newInterval;
    timer.cancel();
    timer.purge();
}