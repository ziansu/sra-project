@java.lang.Override
public void execute() {
    if (isGeoConfigChange()) {
        com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.log.info("Geo config change detected. set rolling reboot to true");
        setRollingRebootNeeded(true);
    }
}