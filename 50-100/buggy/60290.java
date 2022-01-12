@java.lang.Override
protected void onDestroy() {
    if ((mChronometer) != null)
        mChronometer.stop();
    
    com.lwk.familycontact.im.helper.HxCallHelper.getInstance().removeCallStateChangeListener(mStateChangeListener);
    com.lwk.familycontact.project.chat.utils.HeadSetReceiver.unregistFromActivity(this, mHeadSetReceiver);
    setScreenOn();
    releaseWakeLock();
    if (((mSensor) != null) && ((mSensorManager) != null)) {
        mSensorManager.unregisterListener(this, mSensor);
        mSensor = null;
        mSensorManager = null;
    }
    super.onDestroy();
}