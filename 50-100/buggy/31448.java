private void initDevices(com.google.android.things.pio.PeripheralManagerService service) {
    pressure = new admobilize.matrix.gt.matrix.Pressure(wb);
    humidity = new admobilize.matrix.gt.matrix.Humidity(wb);
    imuSensor = new admobilize.matrix.gt.matrix.IMU(wb);
    uvSensor = new admobilize.matrix.gt.matrix.UV(wb);
    everloop = new admobilize.matrix.gt.matrix.Everloop(wb, admobilize.matrix.gt.matrix.Everloop.MATRIX_CREATOR);
    everloop.clear();
    everloop.write(everloop.ledImage);
    micArray = new admobilize.matrix.gt.matrix.MicArray(wb, service);
    android.util.Log.d(admobilize.matrix.gt.MainActivity.TAG, "[MIC] starting capture..");
    micArray.capture(7, 1024, onMicArrayListener);
}