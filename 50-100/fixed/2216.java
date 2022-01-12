public static void itemDetails(java.lang.String id) {
    com.emc.vipr.model.sys.licensing.License license = util.LicenseUtils.getLicense();
    com.emc.vipr.model.sys.licensing.LicenseFeature lf = null;
    for (com.emc.vipr.model.sys.licensing.LicenseFeature feature : license.getLicenseFeatures()) {
        if (org.apache.commons.lang.StringUtils.equalsIgnoreCase(feature.getModelId(), id)) {
            lf = feature;
        }
    }
    render(lf);
}