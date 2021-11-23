@java.lang.Override
protected void onDestroy() {
    if ((mCore) != null) {
        mCore.pauseSensors();
        mCore.shutdown(this);
    }
    com.ilm.sandwich.OsmMap.listHandler.removeCallbacksAndMessages(null);
    com.ilm.sandwich.tools.Statistics mStatistics = new com.ilm.sandwich.tools.Statistics();
    mStatistics.check(this);
    super.onDestroy();
}