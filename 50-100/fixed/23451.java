public long phoneUsedTime() {
    android.util.Log.v("gaurav", ("Map is: " + (mForegroundActivityMap)));
    mUsedTime = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : mForegroundActivityMap.entrySet()) {
        mUsedTime += entry.getValue();
    }
    return mUsedTime;
}