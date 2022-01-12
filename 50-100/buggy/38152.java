@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    java.lang.String forecast = mForecastAdapter.getItem(i);
    if ((getActivity()) != null) {
        android.content.Intent forecastIntent = new android.content.Intent(getActivity(), com.example.android.sunshine.app.DetailActivity.class).putExtra(Intent.EXTRA_TEXT, forecast);
        startActivity(forecastIntent);
    }
}