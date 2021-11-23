@java.lang.Override
protected void onStartLoading() {
    if ((mWeatherData) != null) {
        deliverResult(mWeatherData);
    }else {
        forceLoad();
    }
    super.onStartLoading();
}