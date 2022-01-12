@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(org.septa.android.app.nextarrive.railstationpicker.RailStationPickerFragment.TAG, ("Current Possition is:" + (selectedTab)));
    if ((currentStop) != null)
        android.util.Log.d(org.septa.android.app.nextarrive.railstationpicker.RailStationPickerFragment.TAG, ("Station is:" + (currentStop.getStopName())));
    else
        android.util.Log.d(org.septa.android.app.nextarrive.railstationpicker.RailStationPickerFragment.TAG, "No Station");
    
    consumer.accept(currentStop);
    getDialog().dismiss();
}