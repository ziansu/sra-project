public boolean hasUnit() {
    if ((aUnit) != null) {
        return (aUnit.getUnitType()) != (mw.server.gamelogic.enums.UnitType.NO_UNIT);
    }
    return false;
}