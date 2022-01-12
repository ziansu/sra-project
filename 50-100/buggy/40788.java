@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    safetyComboBox.setItems(model.WaterSafety.getAllObservableList());
    reportNumTextField.setTextFormatter(lib.TextFormatterFactory.integerOnlyTextFormatter());
    vppmTextField.setTextFormatter(lib.TextFormatterFactory.decimalOnlyTextFormatter());
    cppmTextField.setTextFormatter(lib.TextFormatterFactory.integerOnlyTextFormatter());
    resetFields();
}