@java.lang.Override
public void run() {
    getSharedPreferences();
    timber.log.Timber.d(("run: ===>>> PULLING TO REFRESH FLIGHTS==== Destination: " + (app.ga.com.headingout.inputfragment.tabfragment.InputFlightTabFragment.destinationAirportCode)));
    java.lang.String date = ((((app.ga.com.headingout.inputfragment.tabfragment.InputFlightTabFragment.endYear) + "-") + (app.ga.com.headingout.inputfragment.tabfragment.InputFlightTabFragment.endMonth)) + "-") + (app.ga.com.headingout.inputfragment.tabfragment.InputFlightTabFragment.endDay);
    java.lang.String googlePlacesApiKey = getResources().getString(R.string.google_places_key);
    app.ga.com.headingout.inputfragment.ApiManager.getQPExpressFlights(retrofit, bus, googlePlacesApiKey, app.ga.com.headingout.inputfragment.tabfragment.InputFlightTabFragment.originAirportCode, app.ga.com.headingout.inputfragment.tabfragment.InputFlightTabFragment.destinationAirportCode, date);
    recyclerViewSetup();
    flightSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimaryLight, R.color.colorAccent, R.color.colorAccentDark);
    flightSwipeRefreshLayout.setRefreshing(false);
}