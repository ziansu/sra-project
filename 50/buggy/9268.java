public void setSettlement(int newSettlement) {
    currentSettlement = settlementList.get(newSettlement);
    currentBuildingList = currentSettlement.getBuildings();
    placedBuildingList = currentSettlement.getPlacedBuildings();
    updateButtonDisplay();
}