private void updateValidVerticalPositionsMap(main.java.Ship newShip) {
    main.java.ShipDimensions newShipDimension = newShip.getDimension();
    switch (newShip.getOrientation()) {
        case HORIZONTAL :
            for (main.java.ShipDimensions key : this.validVerticalPositionsMap.keySet()) {
                this.updateDiffDirectionValidPositionsList(key, newShip, ShipOrientations.VERTICAL);
            }
            break;
        case VERTICAL :
            for (main.java.ShipDimensions key : this.validHorizontalPositionsMap.keySet()) {
                this.updateSameDirectionValidPositionsLists(key, newShip, ShipOrientations.HORIZONTAL);
            }
            break;
    }
}