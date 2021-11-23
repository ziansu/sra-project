private void initThread(boolean isFirstTime) {
    mIsRunningForegroundAppsThread = true;
    if (isFirstTime)
        mIsFirstTimeStartForgroundAppService = true;
    
    mDatabase = new com.asgj.android.appusage.database.PhoneUsageDatabase(mContext);
    mStartTimestamp = java.lang.System.currentTimeMillis();
    startThread();
    if (isMusicPlaying()) {
        mIsMusicPlayingAtStart = true;
        mIsMusicStarted = true;
        mMusicStartTimeStamp = java.lang.System.currentTimeMillis();
        mMusicStartTime = java.lang.System.nanoTime();
    }
}