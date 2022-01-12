public void onClick(android.view.View v) {
    if (isSensorControlEnabled) {
        isSensorControlEnabled = false;
        toggleControlMode.setText(getString(R.string.text_button));
        android.widget.Toast.makeText(this, getString(R.string.toast_buttonModeEnabled), Toast.LENGTH_SHORT).show();
        stopSensors();
        processAccelerometerData();
    }else {
        isSensorControlEnabled = true;
        toggleControlMode.setText(getString(R.string.text_sensor));
        android.widget.Toast.makeText(this, getString(R.string.toast_sensorModeEnabled), Toast.LENGTH_SHORT).show();
        startSensors();
    }
    toggleDisplayOfWidgets();
}