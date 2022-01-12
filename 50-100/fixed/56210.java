@java.lang.Override
public void organization(io.apiman.manager.api.beans.orgs.OrganizationBean org) {
    currentOrg = org;
    try {
        logger.info(((Messages.i18n.format("StorageImportDispatcher.ImportingOrg")) + (org.getName())));
        storage.createOrganization(org);
    } catch (io.apiman.manager.api.core.exceptions.StorageException e) {
        error(e);
    }
}