public void setNightTemperature(li.klass.fhem.domain.FHTDevice device, double nightTemperature) {
    if ((device.getNightTemperature()) != nightTemperature) {
        java.lang.String command = (("set " + (device.getName())) + " night-temp ") + nightTemperature;
        CommandExecutionService.INSTANCE.executeSafely(command);
        device.setNightTemperature(nightTemperature);
    }
}