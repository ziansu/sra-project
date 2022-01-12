public void increaseLevel() {
    (currentLevel)++;
    java.awt.Point spawn;
    if ((currentLevel) >= 3)
        carsPerLevel = 3;
    
    for (int i = 0; i < (carsPerLevel); i++) {
        do {
            spawn = new java.awt.Point(safeColumns[getSafeColumnIndex()], rows[getRowIndex()]);
        } while (isValidParkingSpot(spawn) );
        shoppingcartmadness.ParkingLot.parkedCars.add(new shoppingcartmadness.ParkedCar(spawn));
    }
}