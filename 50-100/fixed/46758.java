public boolean training(StarcraftAI.UnitType unitType, StarcraftAI.Unit building) {
    if ((unitType == null) || (building == null)) {
        return false;
    }
    if (!(building.isTraining())) {
        building.train(unitType);
        return true;
    }
    return false;
}