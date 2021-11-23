private void addLog() {
    endTime = model.VehicleManagement.getTiming();
    tpl = new log.TrafficMgtPolicyLog(lightState, lightIntervalTime, speedLimit, startTime, endTime);
    lm.addLog(tpl);
}