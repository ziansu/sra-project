private void manageAddingFunctions() {
    susceptibleRooms.remove(entranceRoom);
    susceptibleRooms.remove(exitRoom);
    roomRegions.remove(entranceRoom);
    roomRegions.remove(exitRoom);
    addPowerUps(2);
    if ((MyActivity.canvas.myActivity.level) > 0) {
        addExitDoor(4);
        addPassageDoor(2);
    }
}