private void updateFuelLevel(double fuelLevel) {
    java.lang.System.out.println(("fuelLevel: " + (java.lang.String.valueOf(fuelLevel))));
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