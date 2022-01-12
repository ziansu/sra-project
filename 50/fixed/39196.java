@java.lang.Override
public void thingUpdated(org.eclipse.smarthome.core.thing.Thing thing) {
    updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.HANDLER_CONFIGURATION_PENDING);
    this.thing = thing;
    internalInitialize();
}