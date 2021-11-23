double getRawHeadingError(double requiredRawHeading) {
    return (getGyroRawHeading()) - requiredRawHeading;
}