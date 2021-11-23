public void onUnitDestroy(SCBot.Unit unit) {
    this.regions.recordUnitDestruction(unit);
    if ((unit.getPlayer()) == (this.self)) {
        if (unit.getType().isBuilding())
            queueBuilding(unit.getType(), unit.getTilePosition());
        
        if ((unit.getBuildType()) == (UnitType.Zerg_Overlord))
            this.economy.morphingOverlordsChange((-1));
        
    }
}