public double getCenterX() {
    int index = getLargestAreaIndex();
    double[] centerX = table.getNumberArray("centerX", new double[0]);
    if ((centerX.length) == 0) {
        return 0.0;
    }
    java.lang.System.out.println("Array Exists");
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Center X", centerX[index]);
    return centerX[index];
}