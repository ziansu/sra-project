private void handleTimeRefresh(org.eclipse.smarthome.core.thing.ChannelUID channelUID) {
    org.eclipse.smarthome.core.library.types.DecimalType state = times.get(channelUID.getId());
    if (state == null) {
        state = new org.eclipse.smarthome.core.library.types.DecimalType(1);
    }
    updateState(channelUID.getId(), state);
}