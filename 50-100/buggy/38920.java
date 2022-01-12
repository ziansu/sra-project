public void destroy() {
    map.getCell(realPosition.getColumn(), realPosition.getRow()).setCanSetBuilding(true);
    map.getCell(startingPoint.getRow(), startingPoint.getColumn()).setCanSetBuilding(true);
    map.getCell(realPosition.getRow(), realPosition.getColumn()).setInsideElementsItems(null);
}