private void updateFuelLevel(double fuelLevel) {
    if (validFuelLevelValue(fuelLevel)) {
        if ((this.fuelLevel) != fuelLevel) {
            this.fuelLevel = fuelLevel;
            fuelLevelUpdated = true;
            updateFuelLeftRectangle();
        }
    }else {
        throw new java.lang.IllegalArgumentException("Invalid fuelLevelValue");
    }
}