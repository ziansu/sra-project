public void onReceiveConnections(com.nutomic.syncthingandroid.model.Connections connections) {
    mConnections = connections;
    notifyDataSetChanged();
}