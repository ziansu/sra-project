@java.lang.Override
public void init() {
    super.init();
    com.qualcomm.ftcrobotcontroller.opmodes.Bacon_servo.setPosition(0.5);
    conveyor_servo.setPosition(0.5);
    increment_total = 0.5;
}