private java.lang.Exception updateChangesOntologies(java.lang.String datasetUri, java.lang.String ccName) {
    boolean result;
    org.diachron.detection.utils.MCDUtils mcd = null;
    try {
        mcd = new org.diachron.detection.utils.MCDUtils(propertiesManager.getProperties(), datasetUri, true);
        mcd.deleteCCWithLessPriority(ccName);
        mcd.detectDatasets(true);
    } catch (java.lang.Exception ex) {
        return ex;
    } finally {
        if (mcd != null) {
            mcd.terminate();
        }
    }
    return null;
}