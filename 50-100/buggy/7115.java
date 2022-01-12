private static void initializeRoom(double leftDoorWidth, double rightDoorWidth, boolean hasObstacle) {
    if ((swarms.SwarmSim.roomType) == (swarms.SwarmSim.RoomType.GATES8)) {
        swarms.SwarmSim.buildGates8(hasObstacle);
    }else
        if ((swarms.SwarmSim.roomType) == (swarms.SwarmSim.RoomType.BASIC)) {
            swarms.SwarmSim.buildBasic(leftDoorWidth, rightDoorWidth, hasObstacle);
        }
    
}