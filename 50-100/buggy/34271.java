private void updateValidHorizontalPositionsMap(main.java.Ship newShip) {
    switch (newShip.getOrientation()) {
        case HORIZONTAL :
            for (main.java.ShipDimensions key : this.validVerticalPositionsMap.keySet()) {
                this.updateSameDirectionValidPositionsLists(key, newShip, ShipOrientations.HORIZONTAL);
            }
            break;
        case VERTICAL :
            for (main.java.ShipDimensions key : this.validHorizontalPositionsMap.keySet()) {
                this.updateDiffDirectionValidPositionsList(key, newShip, ShipOrientations.HORIZONTAL);
            }
            break;
    }
}