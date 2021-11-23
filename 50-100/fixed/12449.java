@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.add_serie);
    db = nl.asymmetrics.droidshows.utils.SQLiteStore.getInstance(this);
    series = db.getSeries(2, false, null);
    java.util.List<nl.asymmetrics.droidshows.thetvdb.model.Serie> search_series = new java.util.ArrayList<nl.asymmetrics.droidshows.thetvdb.model.Serie>();
    this.seriessearch_adapter = new nl.asymmetrics.droidshows.ui.AddSerie.SeriesSearchAdapter(this, R.layout.row_search_series, search_series);
    setListAdapter(seriessearch_adapter);
    android.content.Intent intent = getIntent();
    getSearchResults(intent);
}