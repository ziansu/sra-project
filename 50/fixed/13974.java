public void faceLeft() {
    switch (facing) {
        case NORTH :
            facing = ToyRobot.Direction.WEST;
            break;
        case WEST :
            facing = ToyRobot.Direction.SOUTH;
            break;
        case SOUTH :
            facing = ToyRobot.Direction.EAST;
            break;
        case EAST :
            facing = ToyRobot.Direction.NORTH;
            break;
    }
}