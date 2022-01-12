@java.lang.Override
public void onClick(android.view.View view) {
    MillisecondTime = 0L;
    StartTime = 0L;
    TimeBuff = 0L;
    UpdateTime = 0L;
    Seconds = 0;
    Minutes = 0;
    MilliSeconds = 0;
    listElementsArrayList.clear();
    adapter.clear();
    adapter.notifyDataSetChanged();
    handler.removeCallbacks(runnable);
    txtStopWatch.setText("00:00:00");
    btnStopWatchPlay.setText("Start");
    btnLap.setEnabled(false);
}