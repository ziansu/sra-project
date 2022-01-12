private boolean doSupportTez() {
    if (isHiveDBConnSelected()) {
        return org.talend.core.runtime.hd.hive.HiveMetadataHelper.doSupportTez(hiveDistributionCombo.getText(), hiveVersionCombo.getText(), true);
    }
    return false;
}