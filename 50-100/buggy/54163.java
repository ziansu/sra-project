@java.lang.Override
public boolean deleteTaxonomy(org.wso2.carbon.governance.taxonomy.services.IStorageProvider storageProvider, java.lang.String taxonomyName) throws org.wso2.carbon.registry.core.exceptions.RegistryException {
    org.wso2.carbon.governance.taxonomy.services.Registry registry = getGovernanceUserRegistry();
    if (getGovernanceUserRegistry().resourceExists(((org.wso2.carbon.governance.taxonomy.util.TaxonomyConstants.TAXONOMY_CONFIGURATION_PATH) + taxonomyName))) {
        registry.delete(((org.wso2.carbon.governance.taxonomy.util.TaxonomyConstants.TAXONOMY_CONFIGURATION_PATH) + taxonomyName));
        invalidateCache(taxonomyName);
        storageProvider.removeTaxonomy(taxonomyName);
        return true;
    }else {
        return false;
    }
}