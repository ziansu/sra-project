public static android.content.BroadcastReceiver getBroadcastReceiver() {
    return (base.networkstate.NetworkStateReceiver.broadcastReceiver) == null ? new base.networkstate.NetworkStateReceiver() : base.networkstate.NetworkStateReceiver.broadcastReceiver;
}