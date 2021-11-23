public void commitChangeset(hudson.plugins.scm_sync_configuration.model.ChangeSet changeset) {
    try {
        return changeset.isEmpty() ? null : (latestCommitFuture = this.business.queueChangeSet(createScmContext(), changeset, getCurrentUser(), hudson.plugins.scm_sync_configuration.ScmSyncConfigurationDataProvider.retrieveComment()));
    } finally {
        this.setTransaction(null);
    }
}