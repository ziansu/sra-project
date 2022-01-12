@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.aresproductions.flightbookingapp.FlightsAdapter.TAG, (("Flight " + (getPosition())) + " clicked."));
    android.content.Context context = v.getContext();
    context.startActivity(new android.content.Intent(context, com.aresproductions.flightbookingapp.FlightDetailRecyclerActivity.class));
    android.content.Intent intent = new android.content.Intent(context, com.aresproductions.flightbookingapp.FlightDetailRecyclerActivity.class);
    intent.putExtra("detailFlight", com.aresproductions.flightbookingapp.FlightsAdapter.flightsData[getPosition()]);
    context.startActivity(intent);
}