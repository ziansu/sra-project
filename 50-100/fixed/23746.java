private void showScanCodePane(boolean show) {
    scanOrTypeCodePane.setVisible(show);
    productAfterScanPane.setVisible((!show));
    datePickerForSmartCode.setVisible(show);
    if (show) {
        scanOrTypeCodePane.toFront();
    }else {
        datePickerForSmartCode.toFront();
    }
}