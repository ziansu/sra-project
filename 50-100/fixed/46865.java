@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    temp_m[0] = event.values[0];
    temp_m[1] = event.values[1];
    temp_m[2] = event.values[2];
    MainActivity.dataTextView.setText(((((("�ش�����: " + (temp_m[0])) + " ") + (temp_m[1])) + " ") + (temp_m[2])));
    updateSensorsData();
}