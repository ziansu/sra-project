@java.lang.Override
public void onFinishedGoingToSleep(int why) {
    setEnableMarquee(false);
    mEnableRefresh = false;
}