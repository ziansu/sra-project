public void writeCrumb(android.location.Location location, java.lang.String type, android.os.Bundle metadata) {
    if (!(crumbsCalculator.isCrumbAccurate(location, type)))
        return ;
    
    if (ekylibre.zero.BuildConfig.DEBUG)
        android.util.Log.d(TAG, "I'm writing new crumb !");
    
    android.widget.Toast.makeText(this, "NEW CRUMB !!!", Toast.LENGTH_SHORT).show();
    ekylibre.zero.tracking.Crumb crumb = crumbsCalculator.getFinalCrumb();
    putCrumbOnLocalDatabase(crumb, type, metadata);
    sendBroadcastNewCrumb(location);
}