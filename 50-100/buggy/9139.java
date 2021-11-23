private java.lang.Exception updateChangesOntologies(java.lang.String datasetUri, java.lang.String ccName) {
    boolean result;
    try {
        org.diachron.detection.utils.MCDUtils mcd = new org.diachron.detection.utils.MCDUtils(propertiesManager.getProperties(), datasetUri, true);
        mcd.deleteCCWithLessPriority(ccName);
        mcd.detectDatasets(true);
        mcd.terminate();
    } catch (java.lang.Exception ex) {
        return ex;
    }
    return null;
}