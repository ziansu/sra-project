public void SetZipLineServoPosition(double servoPositionDesired) {
    double servoPositionActual = com.qualcomm.robotcore.util.Range.clip(servoPositionDesired, 0, 1);
    if ((ZipLineServo) != null) {
        try {
            ZipLineServo.setPosition(servoPositionActual);
            telemetry.addData("02", ("servoPositionActual: " + servoPositionDesired));
        } catch (java.lang.Exception p_exeception) {
            com.qualcomm.ftccommon.DbgLog.msg(p_exeception.getLocalizedMessage());
            ZipLineServo = null;
        }
    }
}