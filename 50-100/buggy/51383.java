private boolean makeUnitRun() {
    if ((((unit) == null) || ((runTo) == null)) || (unit.isStuck())) {
        return false;
    }else {
        atlantis.debug.AtlantisPainter.paintLine(unit.getPosition(), runTo, Color.Yellow);
        unit.move(runTo, UnitMissions.RUN_FROM_UNIT);
        return true;
    }
}