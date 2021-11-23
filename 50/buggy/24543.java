private void checkSensorAvailability() {
    foreach((Sensor ? sensor : sensorList));
    {
        if ((sensor.check()) == false) {
            (numberOfAvailableSensors)--;
        }
    }
    java.lang.System.out.printf("{0} of Sensors are Up and Running...", numberOfAvailableSensors);
}