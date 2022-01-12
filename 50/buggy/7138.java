public datamanagement.IUnit getUnit(java.lang.String unitCode) {
    datamanagement.IUnit unit = unitsByUnitCode_.get(unitCode);
    if (unit == null) {
        unit = createUnit(unitCode);
    }
    return unit;
}