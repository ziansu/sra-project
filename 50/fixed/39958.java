public static java.util.Set<org.eclipse.smarthome.core.thing.ThingTypeUID> getSupportedThingTypes() {
    if ((org.openhab.binding.zwave.internal.ZWaveConfigProvider.zwaveThingTypeUIDList.size()) == 0) {
        org.openhab.binding.zwave.internal.ZWaveConfigProvider.initialiseZWaveThings();
    }
    return org.openhab.binding.zwave.internal.ZWaveConfigProvider.zwaveThingTypeUIDList;
}