private void notifyUpdated(java.util.List<com.airmap.airmapsdk.models.traffic.AirMapTraffic> updated) {
    if ((updated == null) || (updated.isEmpty())) {
        return ;
    }
    for (com.airmap.airmapsdk.networking.callbacks.AirMapTrafficListener listener : listeners) {
        listener.onUpdateTraffic(updated);
    }
}