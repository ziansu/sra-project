private void manageAddingFunctions() {
    susceptibleRooms.remove(entranceRoom);
    susceptibleRooms.remove(exitRoom);
    roomRegions.remove(entranceRoom);
    roomRegions.remove(exitRoom);
    if ((MyActivity.canvas.myActivity.level) > 0) {
        addPassageDoor(2);
        addExitDoor(4);
    }
    addPowerUps(2);
}