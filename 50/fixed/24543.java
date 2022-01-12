private void checkSensorAvailability() {
    for (Sensor sensor : sensorList) {
        if ((sensor.check()) == false) {
            (numberOfAvailableSensors)--;
        }
    }
    java.lang.System.out.printf("{0} of Sensors are Up and Running...", numberOfAvailableSensors);
}