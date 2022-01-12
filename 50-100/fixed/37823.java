protected boolean processCustomSaveDocumentBusinessRules(org.kuali.rice.krad.maintenance.MaintenanceDocument document) {
    boolean isValid = true;
    org.kuali.ole.deliver.bo.OleCirculationDesk circulationDesk = ((org.kuali.ole.deliver.bo.OleCirculationDesk) (document.getNewMaintainableObject().getDataObject()));
    java.lang.String circulationDeskAction = document.getOldMaintainableObject().getMaintenanceAction();
    setDefaultValues(circulationDesk);
    isValid &= validateCirculationDeskCode(circulationDesk);
    isValid &= validateCirculationDeskBeforeEdit(circulationDeskAction, circulationDesk);
    return isValid;
}