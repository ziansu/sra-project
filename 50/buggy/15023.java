private void clearDestinationStreetCell(int streetId) {
    int cellIndex = getNextCarsDestinationCellIndex(streetId);
    int value = -1;
    setTrafficCell(cellIndex, value);
}