@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> listview, android.view.View view, int position, long id) {
    de.bahnhoefe.deutschlands.bahnhofsfotos.model.Bahnhof bahnhof = dbAdapter.fetchBahnhofByRowId(id);
    de.bahnhoefe.deutschlands.bahnhofsfotos.model.Country country = dbAdapter.fetchCountryByCountryShortCode(countryShortCode);
    java.lang.Class cls = de.bahnhoefe.deutschlands.bahnhofsfotos.DetailsActivity.class;
    android.content.Intent intentDetails = new android.content.Intent(this, cls);
    intentDetails.putExtra(DetailsActivity.EXTRA_BAHNHOF, bahnhof);
    intentDetails.putExtra(DetailsActivity.EXTRA_COUNTRY, country);
    startActivity(intentDetails);
}