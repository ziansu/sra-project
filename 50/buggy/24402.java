public void onReceiveConnections(com.nutomic.syncthingandroid.model.Connections connections) {
    mConnections = com.google.common.base.Optional.of(connections);
    notifyDataSetChanged();
}