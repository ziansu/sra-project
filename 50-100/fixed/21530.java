private void populateGrid() {
    while (!(this.grid.isFull())) {
        main.java.Ship newShip = this.fetchShipFromValidPositionsMap();
        if (newShip != null) {
            this.grid.addShip(newShip);
            this.updateValidPositionsForUnitShip(newShip);
            this.updateValidHorizontalPositionsMap(newShip);
            this.updateValidVerticalPositionsMap(newShip);
        }
    } 
}