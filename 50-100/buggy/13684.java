private void tryBuringItem() {
    fle.api.recipes.instance.FuelHandler.FuelKey key = fle.api.recipes.instance.FuelHandler.getFuel(this.stack);
    if (key != null) {
        {
            decrStackSize(0, key.fuel);
            this.fuelValue = key.fuelValue;
            this.normalBurningPower = key.normalPower;
            this.helper.setBaseMaxTemperature(500.0F);
            return ;
        }
    }
    disable(fle.core.tile.rocky.TEHearth.IsBurining);
    this.helper.setBaseMaxTemperature(0.0F);
}