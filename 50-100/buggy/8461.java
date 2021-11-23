@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String text = forecastViewAdapter.getItem(position);
    android.content.Intent detailActivityIntent = new android.content.Intent(getContext(), com.example.sarh2o.sunshine.DetailActivity.class).putExtra(Intent.EXTRA_TEXT, text);
    startActivity(detailActivityIntent);
}