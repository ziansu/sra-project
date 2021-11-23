@java.lang.Override
public void onNewMessage(Grasping.ArmMsg msg) {
    long[] pwmVals = msg.pwms;
    int shoulderPWM = ((int) (pwmVals[0]));
    int wristPWM = ((int) (pwmVals[1]));
    int gripperPWM = ((int) (pwmVals[2]));
    if (!(objGrasped)) {
        gripperServo.close(msg.pwms[2]);
    }
}