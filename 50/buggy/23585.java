public void setHeadings(double heading) {
    targetHeading = new xbot.common.math.ContiguousHeading();
    currentHeading = drive.imu.getYaw();
}