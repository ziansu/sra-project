public void onUnitDestroy(SCBot.Unit unit) {
    regions.recordUnitDestruction(unit);
    if ((unit.getPlayer()) == (self)) {
        if (unit.getType().isBuilding())
            queueBuilding(unit.getType(), unit.getTilePosition());
        
        if ((unit.getBuildType()) == (UnitType.Zerg_Overlord))
            economy.morphingOverlordsChange((-1));
        
    }
}