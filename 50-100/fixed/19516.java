public void updateOrientation(float azimuth, float verticalInclination, float horizontalInclination) {
    mAzimuthViewLeft = azimuth - ((mHorizontalCameraAngle) / 2);
    mAzimuthViewRight = azimuth + ((mHorizontalCameraAngle) / 2);
    mVerticalAngleViewCenter = (-verticalInclination) - 90;
    mVerticalAngleViewTop = (mVerticalAngleViewCenter) + ((mVerticalCameraAngle) / 2);
    mVerticalAngleViewBottom = (mVerticalAngleViewCenter) - ((mVerticalCameraAngle) / 2);
    mHorizontalInclination = horizontalInclination;
    if ((mPoints) != null) {
        invalidate();
    }
}