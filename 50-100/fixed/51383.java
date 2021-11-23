private boolean makeUnitRun() {
    if ((((unit) == null) || ((runTo) == null)) || (unit.isStuck())) {
        return false;
    }else {
        unit.move(runTo, UnitMissions.RUN_FROM_UNIT);
        return true;
    }
}