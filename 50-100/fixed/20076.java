public void scoutMap() {
    for (bwapi.Unit unit : squads.get(SquadType.Offense).getUnits()) {
        if (unit.isIdle()) {
            unit.move(allPositions.get(((int) ((java.lang.Math.random()) * (allPositions.size())))));
        }
    }
}