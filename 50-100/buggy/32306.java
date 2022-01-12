private jnibwapi.Unit[] getZealots() {
    java.util.ArrayList zealots = new java.util.ArrayList();
    for (jnibwapi.Unit unit : idleUnits()) {
        if ((unit.getType()) == (jnibwapi.types.UnitType.UnitTypes.Protoss_Zealot)) {
            zealots.add(unit);
        }
    }
    return zealots.toArray();
}