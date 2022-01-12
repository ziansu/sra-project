public static boolean isPointInRobot(java.awt.geom.Point2D.Double point, sdp.common.Robot enemy_robot) {
    if ((sdp.common.Utilities.pointInTriangle(point, enemy_robot.getFrontLeft(), enemy_robot.getFrontRight(), enemy_robot.getBackLeft())) && (sdp.common.Utilities.pointInTriangle(point, enemy_robot.getBackLeft(), enemy_robot.getBackRight(), enemy_robot.getFrontRight()))) {
        return true;
    }
    return false;
}