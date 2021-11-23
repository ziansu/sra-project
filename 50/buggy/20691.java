private boolean pause() {
    com.ekreutz.barcodescanner.ui.BarcodeScannerView view = mBarcodeScannerManager.getBarcodeScannerView();
    if (view != null) {
        view.pause();
    }
    return view != null;
}