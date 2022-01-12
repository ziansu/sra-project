private jnibwapi.Unit[] idleUnits() {
    java.util.ArrayList<jnibwapi.Unit> idleUnitsList = new java.util.ArrayList<jnibwapi.Unit>();
    for (jnibwapi.Unit unit : bwapi.getMyUnits()) {
        if (unit.isIdle()) {
            idleUnitsList.add(unit);
        }
    }
    return idleUnitsList.toArray(new jnibwapi.Unit[0]);
}