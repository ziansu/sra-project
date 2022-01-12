public void run() {
    setAutoRect();
    if ((ScannerActivity.param_OverlayMode) == 1) {
        com.manateeworks.MWOverlay.addOverlay(cordova.getActivity(), surfaceView);
    }
    scrollView.scrollTo(((int) ((widthTmpRunnable / 2) - (width / 2))), ((int) ((heightTmpRunnable / 2) - (height / 2))));
}