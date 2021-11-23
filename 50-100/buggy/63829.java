@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    net.kenneho.runnow.database.DB_Travel t = db_ListAdapter.getItem(position);
    uniqueDepartureStation = java.lang.Integer.parseInt(t.departureID);
    departureName = t.departureName;
    destinationName = t.destinationName;
    uniqueDestinationStation = java.lang.Integer.parseInt(t.destinationID);
    verifyAndCreateIntent();
    android.widget.Toast.makeText(getApplicationContext(), (((t.departureName) + " => ") + (t.destinationName)), Toast.LENGTH_LONG).show();
    t.updateTimestamp();
}