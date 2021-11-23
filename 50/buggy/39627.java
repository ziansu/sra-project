@java.lang.Override
public void onRefresh() {
    historySignNum = 0;
    beforeWeekNum = 1;
    syncHistorySignInfo();
    listView.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
    listView.setStackFromBottom(false);
}