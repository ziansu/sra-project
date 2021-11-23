@java.lang.Override
public void onNewMessage(Grasping.ArmMsg msg) {
    int[] pwmVals = msg.pwm;
    for (int i = 0; i < (pwmVals.length); i++) {
        java.lang.System.out.println(((("PWM Value at Channel " + i) + " is: ") + (pwmVals[i])));
    }
    int shoulderPWM = pwmVals[0];
    int wristPWM = pwmVals[1];
    int gripperPWM = pwmVals[2];
    rotateAllServos(msg.pwms[0], msg.pwms[1], msg.pwms[2]);
}