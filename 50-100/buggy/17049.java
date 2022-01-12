public void setMode(li.klass.fhem.domain.FHTDevice device, li.klass.fhem.domain.fht.FHTMode mode) {
    if ((device.getMode()) != mode) {
        java.lang.String command = (("set " + (device.getName())) + " mode ") + (mode.name().toLowerCase());
        CommandExecutionService.INSTANCE.executeSafely(command);
    }
}