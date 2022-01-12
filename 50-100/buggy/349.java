private void testLocation() throws testingPlayer.GameActionException {
    boolean isSuitable = false;
    int suitableLocation = 0;
    for (int i = 0; i < (NUM_CELL_TREES); i++) {
        if (rc.canPlantTree(new testingPlayer.Direction((i * (ANGLE_OFFSET))))) {
            suitableLocation++;
        }
    }
    if (suitableLocation == (NUM_CELL_TREES)) {
        isLocationFound = true;
        buildCell();
    }
}