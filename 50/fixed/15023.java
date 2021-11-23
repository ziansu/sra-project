private void clearDestinationStreetCell(int streetId) {
    int cellIndex = getNextCarsDestinationCellIndex(streetId);
    setTrafficCell(cellIndex, (-1));
}