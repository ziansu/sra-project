private jnibwapi.Unit[] getZealots() {
    java.util.ArrayList<jnibwapi.Unit> zealots = new java.util.ArrayList<jnibwapi.Unit>();
    for (jnibwapi.Unit unit : idleUnits()) {
        if ((unit.getType()) == (jnibwapi.types.UnitType.UnitTypes.Protoss_Zealot)) {
            zealots.add(unit);
        }
    }
    return zealots.toArray(new jnibwapi.Unit[0]);
}