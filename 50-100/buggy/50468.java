public static void loadGlobalConfig() {
    try {
        java.util.HashMap config = new java.util.HashMap();
        hudson.XmlFile xml = org.jenkinsci.plugins.puppetenterprise.models.PuppetEnterpriseConfig.getConfigFile();
        if (xml.exists()) {
            xml.unmarshal(config);
            org.jenkinsci.plugins.puppetenterprise.models.PuppetEnterpriseConfig.puppetMasterUrl = ((java.lang.String) (config.get("puppetMasterUrl")));
            org.jenkinsci.plugins.puppetenterprise.models.PuppetEnterpriseConfig.puppetMasterCACertificate = ((java.lang.String) (config.get("puppetMasterCACertificate")));
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}