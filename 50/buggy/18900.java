public void statusChanged(int newStatus) {
    appsgate.lig.light.actuator.philips.HUE.impl.PhilipsHUEImpl.logger.info(((("The actuator, " + (actuatorId)) + " status changed to ") + newStatus));
    notifyChanges("status", java.lang.String.valueOf(status), java.lang.String.valueOf(newStatus));
}