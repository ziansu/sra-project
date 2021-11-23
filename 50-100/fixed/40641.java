@java.lang.Override
public void onBandSkinTemperatureChanged(com.microsoft.band.sensors.BandSkinTemperatureEvent event) {
    if (event != null) {
        long time = event.getTimestamp();
        skinTemp = event.getTemperature();
        java.lang.String update = java.lang.Long.toString(time);
        update += ("  " + (skinTemp)) + "\n";
        com.microsoft.band.sdk.sampleapp.BandStreamingAppActivity.Params params = new com.microsoft.band.sdk.sampleapp.BandStreamingAppActivity.Params("skimTemperature.txt", update);
        new com.microsoft.band.sdk.sampleapp.BandStreamingAppActivity.writeOnFile().execute(params);
        appendToUI(update);
    }
}