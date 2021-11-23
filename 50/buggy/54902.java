@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    counter += event.values[0];
    android.widget.Toast.makeText(getApplicationContext(), ("STEP " + (counter)), Toast.LENGTH_SHORT).show();
    android.util.Log.d("SensorChange", "triggered");
}