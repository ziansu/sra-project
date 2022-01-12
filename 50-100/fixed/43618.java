@java.lang.Override
public boolean isReadyToStart() {
    java.lang.String path = getConfigurationRootPath();
    javax.jcr.Session session = null;
    try {
        session = repository.loginAdministrative(null);
        return !(getNewestConfigurationNodes(path, session, new biz.netcentric.cq.tools.actool.installationhistory.AcInstallationHistoryPojo()).isEmpty());
    } catch (java.lang.Exception e) {
    } finally {
        if (session != null) {
            session.logout();
        }
    }
    return false;
}