public void operatorControl() {
    if ((java.lang.System.currentTimeMillis()) >= ((time) + (millisPerIteration))) {
        input.update();
        magY = input.getAxis(Axis.Y);
        magRot = input.getAxis(Axis.Z);
        updateClimber();
        showInformation();
        drive.update((-(magY)), magRot);
        time = java.lang.System.currentTimeMillis();
    }
}