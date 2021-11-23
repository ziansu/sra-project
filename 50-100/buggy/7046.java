public void refresh(org.openhab.binding.antiferencematrix.internal.model.OutputPortDetails outputPortDetails) {
    updateState(new org.eclipse.smarthome.core.thing.ChannelUID(getThing().getUID(), org.openhab.binding.antiferencematrix.AntiferenceMatrixBindingConstants.AntiferenceMatrixBindingConstants.PORT_STATUS_MESSAGE_CHANNEL), new org.eclipse.smarthome.core.library.types.StringType(outputPortDetails.getStatusMessage()));
    org.eclipse.smarthome.core.library.types.OnOffType power;
    if ((outputPortDetails.getSinkPowerStatus()) == 1) {
        power = org.eclipse.smarthome.core.library.types.OnOffType.ON;
    }else {
        power = org.eclipse.smarthome.core.library.types.OnOffType.OFF;
    }
    updateState(new org.eclipse.smarthome.core.thing.ChannelUID(getThing().getUID(), org.openhab.binding.antiferencematrix.AntiferenceMatrixBindingConstants.AntiferenceMatrixBindingConstants.POWER_CHANNEL), power);
    updateStatusIfRequired(ThingStatus.ONLINE);
}