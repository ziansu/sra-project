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
    if (!(considerTemperatures())) {
        return ;
    }
    considerSlope();
    considerForecast();
    computeDesiredSpeed();
    processFanChange();
}