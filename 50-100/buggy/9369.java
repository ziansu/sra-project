@java.lang.Override
protected void prepareSaveChangesMadeToEnforcedPropertiesForCurrent() {
    super.prepareSaveChangesMadeToEnforcedPropertiesForCurrent();
    gov.anl.aps.cdb.portal.controllers.ItemDomainInventoryController idic = gov.anl.aps.cdb.portal.controllers.ItemDomainInventoryController.getInstance();
    gov.anl.aps.cdb.portal.controllers.extensions.ItemEnforcedPropertiesController inventoryEnforcedPropertiesController = idic.getItemEnforcedPropertiesController();
    gov.anl.aps.cdb.portal.model.db.entities.ItemDomainCatalog catalogItem = ((gov.anl.aps.cdb.portal.model.db.entities.ItemDomainCatalog) (getCurrent()));
    for (gov.anl.aps.cdb.portal.model.db.entities.Item inventoryItem : catalogItem.getInventoryItemList()) {
        inventoryEnforcedPropertiesController.setCurrent(inventoryItem);
        inventoryEnforcedPropertiesController.prepareSaveChangesMadeToEnforcedPropertiesForCurrent();
    }
}