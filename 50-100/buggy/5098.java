private boolean checkNearObject(int id) {
    boolean isByObject = false;
    int direction = findDirectionOfObject(id);
    if (direction != 0) {
        isByObject = true;
        if (id == 2) {
            monsterNextToPlayerLocaiton = getNewLocation(playerCurrentLocation, direction);
        }else
            if (id == 3) {
                if (((edu.cis232.gwasos.resources.mapobjects.Chest) (getObjectInDirection(playerCurrentLocation, direction))).isOpen()) {
                    isByObject = false;
                }else {
                    isByObject = true;
                }
            }
        
    }
    return isByObject;
}