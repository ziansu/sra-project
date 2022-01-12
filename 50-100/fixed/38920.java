public void destroy() {
    map.getCell(realPosition.getRow(), realPosition.getColumn()).setCanSetBuilding(true);
    map.getCell(startingPoint.getRow(), startingPoint.getColumn()).setCanSetBuilding(true);
    map.getCell(realPosition.getRow(), realPosition.getColumn()).setInsideElementsItems(null);
}