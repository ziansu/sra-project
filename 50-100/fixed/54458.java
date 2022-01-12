protected org.italiangrid.voms.aa.AttributeAuthority newAttributeAuthority() {
    long maximumValidity = org.glite.security.voms.admin.configuration.VOMSConfiguration.instance().getLong(VOMSConfigurationConstants.VOMS_AA_X509_MAX_AC_VALIDITY, java.util.concurrent.TimeUnit.HOURS.toSeconds(12));
    boolean legacyFQANEncoding = org.glite.security.voms.admin.configuration.VOMSConfiguration.instance().getBoolean(VOMSConfigurationConstants.VOMS_AA_X509_LEGACY_FQAN_ENCODING, true);
    return org.italiangrid.voms.aa.AttributeAuthorityFactory.newAttributeAuthority(maximumValidity, legacyFQANEncoding);
}