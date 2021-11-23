public boolean isOverCapacity(com.emc.vipr.model.sys.licensing.LicenseFeature feature) {
    return (getUsagePercentage(feature)) >= 100;
}