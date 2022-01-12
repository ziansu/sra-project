private int countZealots() {
    int zealots = 0;
    for (jnibwapi.Unit unit : idleUnits()) {
        if ((unit.getType()) == (jnibwapi.types.UnitType.UnitTypes.Protoss_Zealot)) {
            zealots += 1;
        }
    }
    return zealots;
}