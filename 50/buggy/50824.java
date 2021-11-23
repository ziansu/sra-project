public void addFuel(int amt) {
    fuelLeft += amt * (teamOD.armourReborn.common.block.tile.TileHeatingComponent.FUEL_MULTIPLIER);
    if ((fuelLeft) < 0) {
        fuelLeft = 0;
        updateInternalTemps(0);
    }
}