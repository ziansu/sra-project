@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle __) {
    GuiUtils.AbstractApplicationScreen.fadeTransition(workerMenuScreenPane);
    barcodeTextField.textProperty().addListener(( observable, oldValue, newValue) -> {
        enableSearchBarcodeButtonCheck();
    });
    editPackagesBarcodeTextField.textProperty().addListener(( observable, oldValue, newValue) -> {
        enableRunTheOperationButton();
    });
    editPackagesDatePicker.setValue(java.time.LocalDate.now());
    worker = EmployeeCommon.TempWorkerPassingData.worker;
    enableSearchBarcodeButtonCheck();
    enableRunTheOperationButton();
}