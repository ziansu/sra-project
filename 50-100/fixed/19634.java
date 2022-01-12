@java.lang.Override
public void barcodeResult(com.journeyapps.barcodescanner.BarcodeResult result) {
    if (((result.getText()) == null) || (result.getText().equals(lastText))) {
        return ;
    }
    lastText = result.getText();
    barcodeView.setStatusText(lastText);
    beepManager.playBeepSoundAndVibrate();
    findLastScannedProduct(result.getText());
}