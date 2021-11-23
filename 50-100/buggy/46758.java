public void training(StarcraftAI.UnitType unitType, StarcraftAI.Unit building) {
    if ((unitType == null) || (building == null)) {
        return ;
    }
    if (!(building.isTraining())) {
        building.train(unitType);
    }
}