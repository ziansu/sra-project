public long getTimeRemaining() {
    if (BuzzWordsApplication.DEBUG) {
        android.util.Log.d(com.buzzwords.PauseTimer.TAG, "getTimeRemaining()");
    }
    return this.mTimeRemaining;
}