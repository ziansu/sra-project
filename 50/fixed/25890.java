@java.lang.Override
public void onClick(android.view.View arg0) {
    if ((sensorFragInterface.getGraphConfig().getSelectedSensor()) != position) {
        sensorFragInterface.getGraphConfig().setSelectedSensor(position);
        listItemSelected = position;
        notifyDataSetChanged();
    }
}