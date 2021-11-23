public void toggle_servo(com.hackzurich.kidssafety.tinkerforge.BrickServo servo, boolean toggle) {
    short SERVO_NUMBER = 6;
    try {
        short position = servo.getPosition(((short) (6)));
        if (position < 0) {
            servo.setPosition(SERVO_NUMBER, ((short) (8000)));
        }else {
            servo.setPosition(SERVO_NUMBER, ((short) (-8000)));
        }
    } catch (java.lang.Exception e) {
    }
}