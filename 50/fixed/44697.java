public void publishDownloadComplete(java.lang.String mapType) {
    bus.post(new com.shahul3d.indiasatelliteweather.events.DownloadCompletedEvent(mapType));
}