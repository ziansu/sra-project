private void updateCubeState() {
    updateState(new org.eclipse.smarthome.core.thing.ChannelUID(getThing().getUID(), CHANNEL_FREE_MEMORY), new org.eclipse.smarthome.core.library.types.DecimalType(freeMemorySlots));
    updateState(new org.eclipse.smarthome.core.thing.ChannelUID(getThing().getUID(), CHANNEL_DUTY_CYCLE), new org.eclipse.smarthome.core.library.types.DecimalType(dutyCycle));
}