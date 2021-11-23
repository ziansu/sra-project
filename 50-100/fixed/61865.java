@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    android.widget.TextView test = ((android.widget.TextView) (findViewById(R.id.tv_test)));
    com.busysnail.sunshineweather.model.Weather weather = ((com.busysnail.sunshineweather.model.Weather) (getIntent().getSerializableExtra(Constants.WEATHER)));
    test.setText(weather.toString());
}