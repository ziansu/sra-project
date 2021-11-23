public void mecanumDrive(double x, double y, double z, double gyro) {
    if (((java.lang.Math.abs(y)) < 0.25) && (y != 0))
        y = (java.lang.Math.signum(y)) * 0.25;
    
    robotDrive.mecanumDrive_Cartesian(x, y, z, gyro);
}