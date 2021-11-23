@java.lang.Override
public void run() {
    getLocation();
    if (isSI) {
        updateWeather(Request.Units.SI);
    }else {
        updateWeather(Request.Units.US);
    }
    getNewsUpdate(mFeedList[mFeedNo]);
    handler.postDelayed(this, 3600000);
}