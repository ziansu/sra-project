public void writeCrumb(android.location.Location location, java.lang.String type, android.os.Bundle metadata) {
    if (!(crumbsCalculator.isCrumbAccurate(location, type, metadata)))
        return ;
    
    ekylibre.zero.tracking.Crumb crumb = crumbsCalculator.getFinalCrumb();
    putCrumbOnLocalDatabase(crumb);
    sendBroadcastNewCrumb(location);
}