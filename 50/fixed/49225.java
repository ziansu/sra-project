@java.lang.Override
protected void onProgressUpdate(io.evercam.network.discovery.DiscoveredCamera... discoveredCameras) {
    if ((getScanActivity()) != null) {
        getScanActivity().addNewCameraToResultList(discoveredCameras[0]);
    }
}