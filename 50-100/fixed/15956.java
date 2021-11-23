public void reloadMDData(com.moneydance.modules.features.invextension.ReportConfig reportConfig) throws java.lang.Exception {
    if ((featureModuleContext) != null) {
        initializeMDDataInApplication(false);
        currentInfo = new com.moneydance.modules.features.invextension.BulkSecInfo(accountBook, reportConfig);
    }else {
        initializeMDDataHeadless(false);
        currentInfo = new com.moneydance.modules.features.invextension.BulkSecInfo(accountBook, reportConfig);
    }
}