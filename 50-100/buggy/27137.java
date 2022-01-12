public thesis.core.sensors.SensorDetections stepSimulation(thesis.core.common.WorldCoordinate sensorLocation) {
    pose.getCoordinate().setCoordinate(sensorLocation);
    slew();
    if (focusedScanning) {
        updateViewRegionFullScan();
    }else {
        updateViewRegionFocusedScan();
    }
    return new thesis.core.sensors.SensorDetections(type, tgtMgr.getTargetsInRegion(viewRegion));
}