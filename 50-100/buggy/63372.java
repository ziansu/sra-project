@java.lang.Override
public int clean() {
    if ((mHost) == null) {
        return 0;
    }
    try {
        mHost.clean();
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
    }
    mIsConnected = false;
    mReceivedCount = 0;
    mSentCount = 0;
    mAnalytics.reset();
    return 0;
}