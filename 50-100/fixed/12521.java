@java.lang.Override
public void onDataReceived() {
    if (sensor.canGetInfo()) {
        temperature = sensor.getTemperature();
        location = sensor.getLocation();
        new java.lang.Thread(run).start();
    }else {
        pCircle.dismiss();
    }
}