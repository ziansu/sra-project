@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.util.Log.d("Spinner", parent.getItemAtPosition(position).toString());
    utep.keanue.sensordata.MainActivity.setMeasurementInterval = java.lang.Integer.parseInt(parent.getItemAtPosition(position).toString());
}