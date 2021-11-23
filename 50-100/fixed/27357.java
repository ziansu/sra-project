public gov.anl.aps.cdb.portal.view.objects.ItemElementConstraintInformation getItemElementConstraintInformation(gov.anl.aps.cdb.portal.model.db.entities.ItemElement itemElement) {
    gov.anl.aps.cdb.portal.view.objects.ItemElementConstraintInformation itemElementConstraintInformation = null;
    if (itemElement != null) {
        itemElementConstraintInformation = itemElement.getConstraintInformation();
        if (itemElementConstraintInformation == null) {
            gov.anl.aps.cdb.portal.model.db.entities.Item parentItem = itemElement.getParentItem();
            if (parentItem != null) {
                gov.anl.aps.cdb.portal.controllers.ItemController itemDomainController = gov.anl.aps.cdb.portal.controllers.ItemController.findDomainControllerForItem(parentItem);
                itemElementConstraintInformation = itemDomainController.loadItemElementConstraintInformation(itemElement);
                itemElement.setConstraintInformation(itemElementConstraintInformation);
            }
        }
    }
    return itemElementConstraintInformation;
}