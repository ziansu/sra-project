@java.lang.Override
public void handleResult(com.google.android.gms.vision.barcode.Barcode barcode) {
    showPopUp(barcode.displayValue);
}