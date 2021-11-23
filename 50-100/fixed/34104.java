@java.lang.Override
public void start() throws java.lang.Exception {
    super.start();
    Jenkins.XSTREAM.registerConverter(new hudson.plugins.scm_sync_configuration.xstream.ScmSyncConfigurationXStreamConverter());
    this.load();
    if ((this.scm) == null) {
        this.scm = hudson.plugins.scm_sync_configuration.scms.SCM.valueOf(hudson.plugins.scm_sync_configuration.scms.ScmSyncNoSCM.class);
        this.scmRepositoryUrl = null;
    }
    hudson.plugins.scm_sync_configuration.SCMManagerFactory.getInstance().start();
}