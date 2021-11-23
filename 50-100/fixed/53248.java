public com.team7.objects.unit.Unit removeUnit(com.team7.objects.unit.Unit unit) {
    this.units.remove(unit);
    unit.getLocation().removeUnitFromTile(unit);
    if ((this.units.size()) == 0) {
        this.noUnits = true;
    }
    return unit;
}