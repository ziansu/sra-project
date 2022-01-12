@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (settings.SAVE_GLOBAL_TRACK_TO_GPX.get()) {
        settings.SAVE_GLOBAL_TRACK_TO_GPX.set(false);
    }
    net.osmand.plus.osmo.OsMoPlugin plugin = net.osmand.plus.OsmandPlugin.getEnabledPlugin(net.osmand.plus.osmo.OsMoPlugin.class);
    if (plugin != null) {
        if (plugin.getTracker().isEnabledTracker()) {
            plugin.getTracker().disableTracker();
        }
    }
    this.stopSelf();
}