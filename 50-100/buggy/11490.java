private void handlePortState() {
    switch (portState) {
        case CLOSED :
            if (open()) {
                portState = org.openhab.binding.dsmr.internal.DSMRPort.PortState.AUTO_DETECT;
                autoDetectTS = java.lang.System.currentTimeMillis();
            }
            break;
        case AUTO_DETECT :
            if (((java.lang.System.currentTimeMillis()) - (autoDetectTS)) > (autoDetectTimeoutMSec)) {
                switchPortSpeed();
                close();
            }
            break;
        case OPENED :
            break;
    }
}