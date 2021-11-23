private double getRawHeadingError(double requiredRawHeading) {
    double diffInHeading = (getGyroRawHeading()) - requiredRawHeading;
    return diffInHeading;
}