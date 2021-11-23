@java.lang.SuppressWarnings(value = "nls")
private void palletBarcodeTextFocusLost() {
    edu.ualberta.med.biobank.dialogs.ScanAssignDialog.log.info("palletBarcodeTextFocusLost: palletBarcodeTextModified: {}, checkingPalletLabel: {}", palletBarcodeTextModified, checkingPalletLabel);
    if (palletBarcodeTextModified) {
        java.lang.String value = ((java.lang.String) (palletBarcode.getValue()));
        palletContainer.setProductBarcode(value);
        if (!(value.isEmpty())) {
            boolean ok = checkPalletBarcode();
            if (!ok) {
                edu.ualberta.med.biobank.gui.common.BgcPlugin.focusControl(palletBarcodeText);
            }
        }
    }
    palletBarcodeTextModified = false;
}