public static void adjustCameraLeft() {
    if ((ShoulderSettings.IS_ROTATION_UNLIMITED) || ((com.teamderpy.shouldersurfing.ShoulderCamera.SHOULDER_ROTATION) < (ShoulderSettings.ROTATION_MAXIMUM))) {
        com.teamderpy.shouldersurfing.ShoulderCamera.SHOULDER_ROTATION += 0.5F;
    }
}