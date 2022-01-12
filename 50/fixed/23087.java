@java.lang.Override
public void onTestButtonClicked() {
    mRoboterHelper.sendFeedCommand(mLastSpeedValue, ((int) (mLastAngleValue)));
}