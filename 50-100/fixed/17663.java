public void toggle_servo(com.hackzurich.kidssafety.tinkerforge.BrickServo servo, boolean toggle) {
    short SERVO_NUMBER = 6;
    try {
        if (toggle) {
            short position = servo.getPosition(((short) (6)));
            servo.setPosition(SERVO_NUMBER, ((short) (8000)));
        }else {
            servo.setPosition(SERVO_NUMBER, ((short) (-8000)));
        }
    } catch (java.lang.Exception e) {
    }
}