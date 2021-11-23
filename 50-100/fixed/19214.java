@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(org.septa.android.app.nextarrive.railstationpicker.RailStationPickerFragment.TAG, ("Current Possition is:" + (selectedTab)));
    if ((currentStop[selectedTab]) == null) {
        android.util.Log.d(org.septa.android.app.nextarrive.railstationpicker.RailStationPickerFragment.TAG, "No Station");
        return ;
    }
    android.util.Log.d(org.septa.android.app.nextarrive.railstationpicker.RailStationPickerFragment.TAG, ("Station is:" + (currentStop[selectedTab].getStopName())));
    consumer.accept(currentStop[selectedTab]);
    getDialog().dismiss();
}