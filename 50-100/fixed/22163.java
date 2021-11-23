public void updateVisionData() {
    try {
        smartDashBoardVisionData = edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.getString("distance and azimuth");
        distanceAndAzimuth = smartDashBoardVisionData.split(":", 2);
        visionDistance = java.lang.Double.parseDouble(distanceAndAzimuth[0]);
        azimuth = java.lang.Double.parseDouble(distanceAndAzimuth[1]);
    } catch (java.lang.Exception e) {
    }
}