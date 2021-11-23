protected void updateLastSeen() {
    lastSeen = java.util.Calendar.getInstance();
    if (isLinked(org.openhab.binding.plugwise.PlugwiseBindingConstants.CHANNEL_LAST_SEEN)) {
        updateState(org.openhab.binding.plugwise.PlugwiseBindingConstants.CHANNEL_LAST_SEEN, new org.eclipse.smarthome.core.library.types.DateTimeType(lastSeen));
    }
    if ((thing.getStatus()) == (OFFLINE)) {
        updateStatus(org.openhab.binding.plugwise.handler.ONLINE);
    }
}