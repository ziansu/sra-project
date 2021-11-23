public boolean getIndexerBottom() {
    boolean current = proccessAnalogInput("indexer-bottom", indexerBottom);
    long now = java.lang.System.currentTimeMillis();
    if (current) {
        lastIndexerBottomOn = now;
        indexerHasGoneUpSinceLastBottomPress = false;
    }
    if (((lastIndexerBottomOn) + 200) >= now) {
        return true;
    }else {
        return !(indexerHasGoneUpSinceLastBottomPress);
    }
}