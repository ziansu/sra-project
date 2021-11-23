public static java.util.Set<org.eclipse.smarthome.core.thing.ThingTypeUID> getSupportedThingTypes() {
    org.openhab.binding.zwave.internal.ZWaveConfigProvider.initialiseZWaveThings();
    return org.openhab.binding.zwave.internal.ZWaveConfigProvider.zwaveThingTypeUIDList;
}