public static double sector(double r, org.montclairrobotics.sprocket.utils.Angle theta) {
    return (1.0 / (2.0.pow(r, 2.0))) * (theta.toRadians());
}