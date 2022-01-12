@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    android.widget.TextView test = ((android.widget.TextView) (findViewById(R.id.tv_test)));
    android.content.Intent intent = getIntent();
    com.busysnail.sunshineweather.model.Weather weather = ((com.busysnail.sunshineweather.model.Weather) (intent.getSerializableExtra(Constants.WEATHER)));
    if (weather != null) {
        android.util.Log.d("detailactivity", weather.toString());
        test.setText(weather.toString());
    }
}