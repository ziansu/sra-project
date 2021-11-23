public void commitChangeset(hudson.plugins.scm_sync_configuration.model.ChangeSet changeset) {
    if (!(changeset.isEmpty()))
        this.business.queueChangeSet(createScmContext(), changeset, getCurrentUser(), hudson.plugins.scm_sync_configuration.ScmSyncConfigurationDataProvider.retrieveComment());
    
    this.setTransaction(null);
}