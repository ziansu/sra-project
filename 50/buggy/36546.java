public void fortify(Territory toTerritory, int units) {
    if ((this.getUnits()) > (units + 1)) {
        this.removeUnits(units);
        toTerritory.addUnits(units);
    }
}