public static double currError(double robotTheta, double alignedBotTheta) {
    double error = robotTheta - (alignedBotTheta - ((java.lang.Math.PI) / 2));
    java.lang.System.out.println(("Error: " + error));
    double rotateGain = 0.25;
    return -(java.lang.Math.min((rotateGain * error), 0.25));
}