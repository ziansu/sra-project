public void incrementTemperature() {
    thermometer.incrementTemperature();
    if ((thermometer.getTemperature()) >= (thermometer.getMaxThreshold())) {
        activateSprinklers();
    }else {
        deactivateSprinklers();
    }
}