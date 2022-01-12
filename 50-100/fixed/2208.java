@java.lang.Override
public void onDataFetchComplete(java.lang.Throwable throwable, java.lang.String key) {
    com.untappedkegg.rally.event.DbEvent.open();
    mWebView.loadData(com.untappedkegg.rally.event.DbEvent.fetchStageResults(eventCode, year, curStage, isFinished), "text/html", "UTF-8");
    mWebView.loadData(com.untappedkegg.rally.event.DbEvent.fetchStageResults(eventCode, year, curStage, isFinished), "text/html", "UTF-8");
    com.untappedkegg.rally.event.DbEvent.close();
    this.setProgressBarVisibility(View.GONE);
}