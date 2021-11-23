private static double computeTargetAltitude(org.usfirst.frc.team1719.robot.sensors.TargetVision.Contour contour) {
    double normalizedPosY = 1.0 - ((2.0 * (contour.posY)) / (org.usfirst.frc.team1719.robot.sensors.TargetVision.VIEW_HEIGHT_PX));
    return ((java.lang.Math.atan((normalizedPosY * (java.lang.Math.tan((((org.usfirst.frc.team1719.robot.sensors.TargetVision.VIEW_ANGLE_HEIGHT_DEG) * (java.lang.Math.PI)) / (180 * 2))))))) * (180.0 / (java.lang.Math.PI))) + (org.usfirst.frc.team1719.robot.sensors.TargetVision.CAM_ANGLE_DEG);
}