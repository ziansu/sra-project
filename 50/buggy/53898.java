public boolean isOverheatedAfterFiring() {
    return (getTemperature()) > ((design.getCriticalTemperature()) + ((design.getHeatIncreasePerGunpowder()) * (getLoadedGunpowder())));
}