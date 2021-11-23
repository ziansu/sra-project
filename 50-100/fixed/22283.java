public void process() {
    if (!(setup())) {
        return ;
    }
    if (!(considerStatePriority())) {
        return ;
    }
    if (!(considerControlMode())) {
        return ;
    }
    considerTemperatures();
    considerSlope();
    considerForecast();
    computeDesiredSpeed();
    processFanChange();
}