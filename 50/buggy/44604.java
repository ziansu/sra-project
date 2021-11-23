@java.lang.Override
public void onClick(android.view.View v) {
    apiTest(com.awingcorsair.simpleweather.activity.ShowWeatherActivity.countyName);
    showWeather();
    android.widget.Toast.makeText(this, "更新完成", Toast.LENGTH_SHORT).show();
}