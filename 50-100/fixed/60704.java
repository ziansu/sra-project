private void palletBarcodeTextFocusLost() {
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