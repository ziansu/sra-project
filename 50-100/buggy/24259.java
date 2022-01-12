@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_edit_trip);
    trip = getIntent().getParcelableExtra(DashboardActivity.INTENT_TRIP_OBJECT);
    getSupportFragmentManager().beginTransaction().replace(R.id.newTripContainer_frameLayout, cs407.onthedot.EditTripDetailsFragment.newInstance(trip.getMeetupTime(), trip.getDestination())).addToBackStack(null).commit();
}