@java.lang.Override
public void barcodeResult(com.journeyapps.barcodescanner.BarcodeResult result) {
    if (((result.getText()) == null) || (result.getText().equals(lastText))) {
        return ;
    }
    lastText = result.getText();
    barcodeView.setStatusText(result.getText());
    findLastScannedProduct(result.getText());
    beepManager.playBeepSoundAndVibrate();
}