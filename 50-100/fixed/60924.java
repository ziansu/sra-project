public static double currError(double robotTheta, double alignedBotTheta) {
    double error = (robotTheta - (alignedBotTheta - ((java.lang.Math.PI) / 2))) % (2 * (java.lang.Math.PI));
    if ((java.lang.Math.abs(error)) > (java.lang.Math.PI)) {
        error -= 2 * (java.lang.Math.PI);
    }
    java.lang.System.out.println(("Error: " + error));
    return error;
}