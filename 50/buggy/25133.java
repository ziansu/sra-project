private boolean start() {
    com.ekreutz.barcodescanner.ui.BarcodeScannerView view = mBarcodeScannerManager.getBarcodeScannerView();
    if (view != null) {
        view.start();
    }
    return view != null;
}