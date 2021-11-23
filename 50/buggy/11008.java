private void removeServerObjectReceivedListeners() {
    if ((serverObjectReceivedListener) != null) {
        network.removeServerObjectReceivedListener(serverObjectReceivedListener);
    }
}