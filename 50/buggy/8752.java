private void restartTango() {
    if ((mParameterNode) != null)
        mParameterNode.setPreferencesFromParameterServer();
    
    updateSaveMapButton();
    mTangoServiceClientNode.callTangoConnectService(TangoConnectRequest.RECONNECT);
}