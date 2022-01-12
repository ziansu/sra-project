public com.romio.locationtest.data.repository.AreasManager getAreasManager() {
    if ((areasManager) == null) {
        areasManager = new com.romio.locationtest.data.repository.AreasManagerImpl(this, this, getNetworkManager());
    }
    return areasManager;
}