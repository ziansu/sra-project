@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    java.lang.String forecast = mForecastAdapter.getItem(position);
    android.content.Intent intent = new android.content.Intent(getActivity(), com.example.android.sunshine.app.DetailActivity.class).putExtra(Intent.EXTRA_TEXT, forecast);
    startActivity(intent);
}