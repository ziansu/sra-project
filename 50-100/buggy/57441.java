@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_locations_list);
    android.support.v7.app.ActionBar myActionBar = getSupportActionBar();
    if (myActionBar != null) {
        myActionBar.setDisplayHomeAsUpEnabled(true);
    }
    setTitle("Tour Stops");
    myCursorAdapter = new com.example.joseph.tlucampustour.LocationsCursorAdapter(this, null, 0);
    android.widget.ListView list = ((android.widget.ListView) (findViewById(R.id.locationList)));
    list.setAdapter(myCursorAdapter);
    getLoaderManager().initLoader(0, null, this);
}