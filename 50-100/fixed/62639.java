private void testMiniRobotForTraps() {
    for (MiniRobot x : miniRobots) {
        Coord place = x.getPosition();
        for (Trap i : traps) {
            if (i.collide(place)) {
                i.steppedOnByMiniRobot(x);
            }
        }
    }
}