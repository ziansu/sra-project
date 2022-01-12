public double getHypotneuse0(double angle) {
    double opposite0 = (heightToBottomOfTopTarget) + (cameraHeight);
    double hypotneuse_0 = opposite0 / (edu.wpi.first.wpilibj.templates.MathX.sin(getTheta(angle)));
    java.lang.System.out.println(("Phi " + (getTheta(angle))));
    return hypotneuse_0;
}