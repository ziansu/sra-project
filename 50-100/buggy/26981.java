@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    try {
        readSheets();
    } catch (java.io.IOException e) {
        setErrorMessage(org.deidentifier.arx.gui.resources.Resources.getMessage("ImportWizardPageExcel.4"));
    }
    comboSheet.setVisible(true);
    lblSheet.setVisible(true);
    btnContainsHeader.setVisible(true);
    comboSheet.select(workbook.getActiveSheetIndex());
    comboSheet.notifyListeners(SWT.Selection, null);
}