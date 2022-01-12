@java.lang.Override
public void onDestroy() {
    com.mobile.myweather.app.WeatherMapActivity.mPlayer.stop();
    super.onDestroy();
    mapView.onDestroy();
}