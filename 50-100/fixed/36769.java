public static void setPuppetMasterUrl(java.lang.String url) throws java.io.IOException, java.net.UnknownHostException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, org.apache.http.conn.HttpHostConnectException {
    org.jenkinsci.plugins.puppetenterprise.models.PuppetEnterpriseConfig.puppetMasterUrl = url;
    if (((org.jenkinsci.plugins.puppetenterprise.models.PuppetEnterpriseConfig.puppetMasterCACertificate) == null) || (org.jenkinsci.plugins.puppetenterprise.models.PuppetEnterpriseConfig.puppetMasterCACertificate.isEmpty())) {
        org.jenkinsci.plugins.puppetenterprise.models.PuppetEnterpriseConfig.puppetMasterCACertificate = org.jenkinsci.plugins.puppetenterprise.models.PuppetEnterpriseConfig.retrievePuppetMasterCACertificate();
    }
    org.jenkinsci.plugins.puppetenterprise.models.PuppetEnterpriseConfig.save();
}