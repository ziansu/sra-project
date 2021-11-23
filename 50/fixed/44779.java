boolean isContained(final java.util.Set<java.lang.String> set, final java.lang.String template) {
    if ((set != null) && (template != null)) {
        return set.contains(template.toLowerCase(org.complykit.licensecheck.mojo.OpenSourceLicenseCheckMojo.LOCALE));
    }
    return false;
}