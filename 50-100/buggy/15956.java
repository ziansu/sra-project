public void reloadMDData(com.moneydance.modules.features.invextension.ReportConfig reportConfig) throws java.lang.Exception {
    if ((featureModuleContext) != null) {
        initializeMDDataInApplication();
        currentInfo = new com.moneydance.modules.features.invextension.BulkSecInfo(accountBook, reportConfig);
    }else {
        initializeMDDataHeadless();
        currentInfo = new com.moneydance.modules.features.invextension.BulkSecInfo(accountBook, reportConfig);
    }
}