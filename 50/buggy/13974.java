public void faceLeft() {
    switch (facing) {
        case NORTH :
            facing = ToyRobot.Direction.WEST;
        case WEST :
            facing = ToyRobot.Direction.SOUTH;
        case SOUTH :
            facing = ToyRobot.Direction.EAST;
        case EAST :
            facing = ToyRobot.Direction.NORTH;
    }
}