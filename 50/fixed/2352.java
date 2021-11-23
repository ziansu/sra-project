@java.lang.Override
public void onClick(android.view.View v) {
    StationIntent.putExtra("mLat", myLat);
    StationIntent.putExtra("mLng", myLng);
    StationIntent.putExtra("ID", SelectedID);
    startActivity(StationIntent);
    setContentView(R.layout.activity_station_picker);
}