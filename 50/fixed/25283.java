@java.lang.Override
public void run() {
    if (isSI) {
        updateWeather(Request.Units.SI);
    }else {
        updateWeather(Request.Units.US);
    }
    getNewsUpdate(mFeedList[mFeedNo]);
    handler.postDelayed(this, 3600000);
}