public void onDisable() {
    currentLoader.onDisable();
    com.comphenix.protocol.ProtocolLibrary.getProtocolManager().removePacketListeners(this);
    saveConfig();
}