public void setRobot(int rdx) {
    if (((rdx >= 0) && (rdx < (ROBOTS.size()))) && ((ROBOTS.get(rdx)) != (activeRobot))) {
        hold();
        robot.RoboticArm prevActive = activeRobot;
        activeRobot = ROBOTS.get(rdx);
        if (prevActive != (activeRobot)) {
            nextScreen(ScreenMode.DEFAULT);
        }
    }
}