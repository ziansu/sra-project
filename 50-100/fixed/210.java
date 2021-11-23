@java.lang.Override
public void tileDownloaded(net.osmand.data.MapTileDownloader.DownloadRequest request) {
    if (((request != null) && (!(request.error))) && ((request.fileToSave) != null)) {
        net.osmand.plus.ResourceManager mgr = getMyApplication().getResourceManager();
        mgr.tileDownloaded(request);
    }
    if ((request == null) || (!(request.error))) {
        mapView.tileDownloaded(request);
    }
}