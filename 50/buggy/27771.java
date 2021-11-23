private void turnOnHeatWhenTooCold() {
    if ((hvac.temp()) < 65) {
        hvac.heat(true);
        if (heaterFanTimer.canRun()) {
            hvac.fan(true);
        }
    }
}