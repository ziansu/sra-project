@java.lang.Override
protected void enableFields(boolean enable) {
    scanMode = edu.ualberta.med.biobank.forms.linkassign.SpecimenLinkAndAssignForm.ScanMode.NONE;
    linkedSpecimensMap.clear();
    setChildrenActionSectionEnabled(false);
    multiSelectionEnabled = false;
    enableMultiSelection(false);
    palletWidget.setCells(getCells());
    palletScanManagement.onReset();
    scanAssignSettings = edu.ualberta.med.biobank.forms.linkassign.SpecimenLinkAndAssignForm.ScanAssignSettings.getInitialValues();
    cancelConfirmWidget.reset();
    currentGridDimensions = new edu.ualberta.med.biobank.model.util.RowColPos(edu.ualberta.med.biobank.model.util.RowColPos.ROWS_DEFAULT, edu.ualberta.med.biobank.model.util.RowColPos.COLS_DEFAULT);
    specimenPositionsValid.setValue(false);
}