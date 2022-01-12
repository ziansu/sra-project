@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.i(com.dknutsonlaw.android.runtracker2.RunFragment.TAG, (" Pressed StartButton. Run Id is " + (mRun.getId())));
    android.os.Message msg = android.os.Message.obtain(null, Constants.MESSAGE_START_LOCATION_UPDATES);
    msg.replyTo = new android.os.Messenger(new com.dknutsonlaw.android.runtracker2.RunFragment.IncomingHandler(this));
    try {
        mLocationService.send(msg);
    } catch (android.os.RemoteException e) {
        android.util.Log.i(com.dknutsonlaw.android.runtracker2.RunFragment.TAG, "RemoteException thrown when trying to send MESSAGE_START_LOCATION_UPDATES");
    }
    mRunManager.startTrackingRun(getActivity(), mRunId);
    updateUI();
}