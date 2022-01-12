@java.lang.Override
public void prepareForCollection(double collectionTime, int numImages, gda.scan.ScanInformation scanInfo) throws java.lang.Exception {
    super.prepareForCollection(collectionTime, numImages, scanInfo);
    getAdBase().setAcquirePeriod(0.0);
    if (gda.util.LiveModeUtil.isLiveMode()) {
        adDriverPco.getArmModePV().putWait(true);
    }
}