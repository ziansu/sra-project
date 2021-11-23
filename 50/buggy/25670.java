protected void onAllUpstreamsFinished() {
    for (int i = 0; i < (downstreams.length); i++) {
        sendRequestIfNeeded(i);
    }
}