private jnibwapi.Unit[] idleUnits() {
    java.util.ArrayList idleUnitsList = new java.util.ArrayList();
    for (jnibwapi.Unit unit : bwapi.getMyUnits()) {
        if (unit.isIdle()) {
            idleUnitsList.add(unit);
        }
    }
    return idleUnitsList.toArray();
}