public void setRobot(int rdx) {
    if (((rdx >= 0) && (rdx < (ROBOTS.size()))) && ((ROBOTS.get(rdx)) != (robot.RobotRun.getActiveRobot()))) {
        hold();
        robot.RoboticArm prevActive = activeRobot;
        activeRobot = ROBOTS.get(rdx);
        if (prevActive != (activeRobot)) {
            nextScreen(ScreenMode.DEFAULT);
        }
    }
}