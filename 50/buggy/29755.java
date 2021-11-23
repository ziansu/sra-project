@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((CallActivity.opponentsList) != null) {
        CallActivity.opponentsList = null;
        com.quickblox.sample.videochatwebrtcnew.adapters.OpponentsAdapter.i = 0;
    }
}