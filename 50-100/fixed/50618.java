@java.lang.Override
public void policyDef(io.apiman.manager.api.beans.policies.PolicyDefinitionBean policyDef) {
    try {
        logger.info(((Messages.i18n.format("StorageImportDispatcher.ImportingPolicyDef")) + (policyDef.getName())));
        storage.createPolicyDefinition(policyDef);
        policyDefIndex.put(policyDef.getId(), policyDef);
    } catch (io.apiman.manager.api.core.exceptions.StorageException e) {
        error(e);
    }
}