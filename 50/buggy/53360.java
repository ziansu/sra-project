@java.lang.Override
public java.util.List<org.openmrs.module.openhmis.inventory.api.model.StockOperation> getUserOperations(org.openmrs.User user, org.openmrs.module.openhmis.commons.api.PagingInfo paging) {
    return getUserOperations(user, null, null, null, paging);
}