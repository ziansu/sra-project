private int incrementFloor(int incAmount) {
    int nextFloorID = (currentFloor.getFloorNumber()) + incAmount;
    if ((currentBuilding) == null) {
        java.lang.System.out.println("You have not specififed a building");
    }else
        if ((nextFloorID <= (currentBuilding.getFloors().size())) && (nextFloorID > 0)) {
            try {
                changeFloor(currentBuilding.getFloor(nextFloorID));
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    
    return -1;
}