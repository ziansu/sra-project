public double getHeadingOffeset(double[] in, double theta) {
    double H = in[1];
    double W = in[0];
    double x = in[3];
    double epsilon = x - (640 / 2);
    double gamma = java.lang.Math.atan(((2 * epsilon) / ((org.usfirst.frc.team948.robot.visionProc.initialDistance) * (org.usfirst.frc.team948.robot.visionProc.initialWidth))));
    return gamma;
}