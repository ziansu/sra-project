private void reset() {
    this.beginTime = ATTickDataFetcher.DEFAULT_BEGIN_TIME;
    this.setTimeWindow(ATTickDataFetcher.DEFAULT_TIME_WINDOW);
    ATTickDataFetcher.CANCEL = false;
}