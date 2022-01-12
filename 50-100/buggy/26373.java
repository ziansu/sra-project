public void lockLiftMotor() {
    runToPosition = true;
    lockLift = true;
    liftMotor.setTargetPosition(liftMotor.getCurrentPosition());
    if ((liftMotor.getMode()) != (DcMotor.RunMode.RUN_TO_POSITION)) {
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    liftMotor.setPower(1);
}