@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_show_edit_place);
    com.gabm.fancyplaces.ui.ShowEditPlace.curAppContext = ((com.gabm.fancyplaces.FancyPlacesApplication) (getApplicationContext()));
    updateElementIDs();
    setupFadingToolbar();
    mapHandler = new com.gabm.fancyplaces.functional.OsmMapHandler(currentViewElements.mapView, null);
    currentViewElements.mapView.setEnabled(false);
    locationHandler = new com.gabm.fancyplaces.functional.LocationHandler(this);
    locationHandler.setOnLocationUpdatedListener(this);
    currentState.result_code = com.gabm.fancyplaces.ui.ShowEditPlace.RESULT_DATA_NOT_CHANGED;
    if (savedInstanceState == null) {
        setStateFromIntent(getIntent());
        onActivityModeChanged();
    }
}