public boolean buildBuilding(StarcraftAI.UnitType unitType) {
    if (unitType.isBuilding()) {
        StarcraftAI.Unit builder = workerManager.getWorker();
        if ((builder != null) && (game.canMake(builder, unitType))) {
            buildingManager.build(unitType, builder);
            return true;
        }
    }
    return false;
}