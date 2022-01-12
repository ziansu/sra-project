public org.kuali.rice.krad.service.BusinessObjectService getBusinessObjectService() {
    if ((businessObjectService) == null) {
        businessObjectService = org.kuali.kra.infrastructure.KraServiceLocator.getService(org.kuali.rice.krad.service.BusinessObjectService.class);
    }
    return businessObjectService;
}