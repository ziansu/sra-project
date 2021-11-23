@java.lang.Override
public void onRefresh() {
    mBusTimeInfoView.setText("");
    startBusTrackOperation(intentThatStartedThisActivity);
}