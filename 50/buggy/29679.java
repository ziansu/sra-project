public void roboInit() {
    motor = hardwareMap.dcMotor.get("MOTOR");
    touchSensor = hardwareMap.touchSensor.get("sensor_touch");
    colorSensor = hardwareMap.colorSensor.get("color_sensor");
    colorSensor.enableLed(true);
}