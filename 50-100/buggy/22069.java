private void stopSensors(final org.deviceconnect.android.deviceplugin.linking.linking.LinkingDevice device) {
    if ((((containsBattery(device)) || (containsHumidity(device))) || (containsOrientation(device))) || (containsTemperature(device))) {
        return ;
    }
    int count = countDownSensor(device.getBdAddress());
    for (int i = 0; i < count; i++) {
        stopSensors(device.getBdAddress());
    }
}