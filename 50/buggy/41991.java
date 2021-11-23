private void handleTimeRefresh(org.eclipse.smarthome.core.thing.ChannelUID channelUID) {
    org.eclipse.smarthome.core.library.types.DecimalType state = times.get(channelUID.getId());
    updateState(channelUID.getId(), state);
}