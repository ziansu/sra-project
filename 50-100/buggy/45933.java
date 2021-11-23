@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_home_activity, container, false);
    android.widget.ListView forecastListView = ((android.widget.ListView) (rootView.findViewById(R.id.list_weather_forecast_items)));
    forecastAdapter = new com.bmv.smartweather.view.WeatherArrayAdapter(getActivity(), R.layout.forecast_list_item);
    forecastListView.setAdapter(forecastAdapter);
    return rootView;
}