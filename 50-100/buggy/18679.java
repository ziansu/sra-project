private void destroyUnitAt(int x, int y) {
    data.Unit unit = this.gridContents[x][y];
    if (unit == null)
        java.lang.System.out.println("Trying to destroy a null unit");
    
    if (unit.getUnitType().hasCategory(data.UnitCategory.FRONTLINE))
        this.updateDeployPoints(unit.isOwnedByPlayer1(), x);
    
    this.gridContents[x][y] = null;
}