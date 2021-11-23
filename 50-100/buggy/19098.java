@java.lang.Override
public void initialize() {
    logger.debug("initializing handler for thing {}", getThing().getUID());
    if (migrateThingType()) {
        return ;
    }
    if ((getUDN()) != null) {
        updateStatus(ThingStatus.ONLINE);
        this.discoveryServiceRegistry.addDiscoveryListener(this);
        onUpdate();
        super.initialize();
    }else {
        updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.CONFIGURATION_ERROR);
        logger.warn("Cannot initalize the zoneplayer. UDN not set.");
    }
}