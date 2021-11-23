private void startDiscovery() {
    this.startDiscoveryTS = new java.util.Date();
    if (btAdapter.startDiscovery()) {
        ui.showToast("Executing discovery");
    }
}