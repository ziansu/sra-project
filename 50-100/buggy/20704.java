private void validateMarketplaceID(java.lang.String marketplaceId) throws org.oscm.internal.types.exception.ObjectNotFoundException {
    org.oscm.domobjects.Marketplace marketplace = new org.oscm.domobjects.Marketplace();
    marketplace.setMarketplaceId(marketplaceId);
    try {
        marketplace = ((org.oscm.domobjects.Marketplace) (dm.getReferenceByBusinessKey(marketplace)));
    } catch (org.oscm.internal.types.exception.ObjectNotFoundException e) {
        org.oscm.operatorservice.bean.OperatorServiceBean.logger.logDebug(("Marketplace not found: " + (e.getMessage())));
        throw e;
    }
}