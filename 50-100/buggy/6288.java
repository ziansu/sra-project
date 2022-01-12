public double calculateAngle(double pixel, double width, double maxAngle, double oldAngle) {
    io.github.data4all.logger.Log.d(io.github.data4all.util.PointToCoordsTransformUtil.TAG, ((("Calculate Angle, OldAngle: " + oldAngle) + " maxANgle: ") + maxAngle));
    if ((pixel - (width / 2)) == 0) {
        return oldAngle;
    }
    double percent = (width / 2) / (pixel - (width / 2));
    double angle = maxAngle * percent;
    return oldAngle + angle;
}