@java.lang.Override
public biz.netcentric.cq.tools.actool.installationhistory.AcInstallationHistoryPojo installYamlFilesFromPackage(com.day.jcr.vault.fs.io.Archive archive, javax.jcr.Session session) throws java.lang.Exception {
    biz.netcentric.cq.tools.actool.installationhistory.AcInstallationHistoryPojo history = new biz.netcentric.cq.tools.actool.installationhistory.AcInstallationHistoryPojo();
    java.util.Set<biz.netcentric.cq.tools.actool.authorizableutils.AuthorizableInstallationHistory> authorizableInstallationHistorySet = new java.util.LinkedHashSet<biz.netcentric.cq.tools.actool.authorizableutils.AuthorizableInstallationHistory>();
    try {
        java.util.Map<java.lang.String, java.lang.String> configs = configFilesRetriever.getConfigFileContentFromPackage(archive);
        aceService.installNewConfigurations(session, history, configs, authorizableInstallationHistorySet);
    } catch (java.lang.Exception e) {
        history.addError(e.toString());
        throw e;
    } finally {
    }
    return history;
}