private java.lang.String generateDrmsDocumentId() throws gov.ca.cwds.rest.services.ServiceException {
    gov.ca.cwds.rest.api.domain.cms.PostedDrmsDocument postedDrmsDocument = null;
    try {
        java.lang.String staffPersonId = staffPersonIdRetriever.getStaffPersonId();
        gov.ca.cwds.rest.api.domain.cms.DrmsDocument drmsDocument = gov.ca.cwds.rest.api.domain.cms.DrmsDocument.createDefaults(staffPersonId);
        postedDrmsDocument = drmsDocumentService.create(drmsDocument);
    } catch (gov.ca.cwds.rest.services.ServiceException e) {
        java.lang.String message = e.getMessage();
        logError(message, e);
    }
    if (postedDrmsDocument == null) {
        throw new gov.ca.cwds.rest.services.ServiceException("Unable to Create DRMS Documents");
    }
    return postedDrmsDocument.getId();
}