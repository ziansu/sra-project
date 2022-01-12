public org.eclipse.smarthome.core.thing.type.ChannelType getChannelType(org.eclipse.smarthome.core.thing.ChannelUID channelUID, java.util.Locale locale) {
    org.eclipse.smarthome.core.thing.type.ThingType thingType = this.getThingType(channelUID.getThingTypeUID(), locale);
    if (thingType != null) {
        org.eclipse.smarthome.core.thing.type.ChannelTypeUID channelTypeUID = thingType.getChannelTypeUID(channelUID);
        return org.eclipse.smarthome.core.thing.type.TypeResolver.resolve(channelTypeUID);
    }
    return null;
}