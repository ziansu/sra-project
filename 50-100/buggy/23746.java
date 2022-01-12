private void showScanCodePane(boolean show) {
    scanOrTypeCodePane.setVisible(show);
    productAfterScanPane.setVisible((!show));
    datePickerForSmartCode.setVisible(show);
    if (show) {
        scanOrTypeCodePane.toFront();
    }else {
        datePickerForSmartCode.toFront();
    }
    datePickerForSmartCode.setValue(null);
    this.expirationDate = null;
    addProductParametersToQuickView("N/A", "N/A", "N/A", "N/A", "N/A");
    amountInWarehouse = amountInStore = -1;
}