private void stopStatusMonitoring(org.cobaltians.cobalt.plugin.CobaltPluginWebContainer webContainer) {
    io.kristal.networkstatusplugin.NetworkStatusPlugin.removeReference(listeningFragments, webContainer.getFragment());
    if (org.cobaltians.cobalt.Cobalt.DEBUG)
        android.util.Log.d(io.kristal.networkstatusplugin.NetworkStatusPlugin.TAG, (("Fragment " + (webContainer.getFragment())) + " stopped listening network status changes"));
    
    if ((listeningFragments.size()) <= 0) {
        networkChangeReceiver.remove();
        networkChangeReceiver = null;
        if (org.cobaltians.cobalt.Cobalt.DEBUG)
            android.util.Log.d(io.kristal.networkstatusplugin.NetworkStatusPlugin.TAG, "No fragment listening ; shutting down NetworkChangeReceiver");
        
    }
}