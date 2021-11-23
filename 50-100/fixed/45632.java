public static void main(java.lang.String[] args) {
    arduino.TestDisplay display = new arduino.TestDisplay();
    arduino.runSensorData rsd = new arduino.runSensorData();
    arduino.runReadSpeed rrs = new arduino.runReadSpeed();
    arduino.runInput ri = new arduino.runInput();
    rsd.start();
    rrs.start();
    ri.start();
}