@java.lang.Override
public void loop() {
    float BucketMotorJoystick = gamepad2.right_stick_y;
    double Bucket_Motor_Power = java.lang.Math.pow(BucketMotorJoystick, 3);
    if (((gamepad2.right_stick_y) < 0.05) && ((gamepad2.right_stick_y) > (-0.05))) {
        com.qualcomm.ftcrobotcontroller.opmodes.Bucket_Motor.setPower(0);
    }
    if ((gamepad2.right_stick_y) > 0.05) {
        com.qualcomm.ftcrobotcontroller.opmodes.Bucket_Motor.setPower(Bucket_Motor_Power);
    }
    if ((gamepad2.right_stick_y) < (-0.05)) {
        com.qualcomm.ftcrobotcontroller.opmodes.Bucket_Motor.setPower((-Bucket_Motor_Power));
    }
}