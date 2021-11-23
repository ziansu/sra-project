@java.lang.Override
public void updateChannel(org.eclipse.smarthome.core.thing.ChannelUID channel) {
    org.eclipse.smarthome.core.library.types.OnOffType onOffType;
    switch (channel.getId()) {
        case org.openhab.binding.zoneminder.ZoneMinderConstants.CHANNEL_IS_ALIVE :
            updateState(channel, (isAlive ? org.eclipse.smarthome.core.library.types.OnOffType.ON : org.eclipse.smarthome.core.library.types.OnOffType.OFF));
        default :
            logger.error("updateChannel() in base class, called for an unknown channel '{}', this channel must be handled in super class.", channel.getId());
    }
}