@net.echinopsii.ariane.community.core.directory.base.persistence.iPojo.Validate
public void validate() throws java.lang.InterruptedException {
    while (((persistenceProvider) == null) || (!(net.echinopsii.ariane.community.core.directory.base.persistence.iPojo.DirectoryJPAProviderImpl.isConfigurationValid()))) {
        net.echinopsii.ariane.community.core.directory.base.persistence.iPojo.DirectoryJPAProviderImpl.log.debug("Persistence provider or valid config is missing for {}. Sleep some times...", net.echinopsii.ariane.community.core.directory.base.persistence.iPojo.DirectoryJPAProviderImpl.DIRECTORY_TXPERSISTENCE_PERSISTENCE_UNIT_NAME);
        java.lang.Thread.sleep(10);
    } 
    this.start();
    net.echinopsii.ariane.community.core.directory.base.persistence.iPojo.DirectoryJPAProviderImpl.isStarted = true;
    net.echinopsii.ariane.community.core.directory.base.persistence.iPojo.DirectoryJPAProviderImpl.log.info("{} is started", new java.lang.Object[]{ net.echinopsii.ariane.community.core.directory.base.persistence.iPojo.DirectoryJPAProviderImpl.DIRECTORY_TXPERSISTENCE_CONSUMER_SERVICE_NAME });
}