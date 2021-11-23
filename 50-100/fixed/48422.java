@java.lang.Override
public void onResult(com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult result) {
    final java.util.List<com.google.android.gms.wearable.Node> nodes = result.getNodes();
    if (nodes != null) {
        for (int i = 0; i < (nodes.size()); i++) {
            final com.google.android.gms.wearable.Node node = nodes.get(i);
            Wearable.MessageApi.sendMessage(mApiClient, node.getId(), "/wifi-connected", null);
        }
    }
}