@java.lang.Override
public void serviceTaskDidSucceed(java.lang.Object model) {
    progressBar.setVisibility(View.GONE);
    telolahy.com.demoweather.model.Weather weather = ((telolahy.com.demoweather.model.Weather) (model));
    java.util.ArrayList<telolahy.com.demoweather.model.Weather> weathers = new java.util.ArrayList<>();
    weathers.add(weather);
    telolahy.com.demoweather.adapter.WeatherListAdapter adapter = new telolahy.com.demoweather.adapter.WeatherListAdapter(weathers, this);
    listView.setAdapter(adapter);
}