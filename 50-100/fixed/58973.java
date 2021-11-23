public void run() {
    setAutoRect();
    if ((ScannerActivity.param_OverlayMode) == 1) {
        com.manateeworks.MWOverlay.addOverlay(cordova.getActivity(), surfaceView);
    }
    scrollView.scrollTo(((int) (java.lang.Math.round(((widthTmpRunnable / 2) - (width / 2))))), ((int) (java.lang.Math.round(((heightTmpRunnable / 2) - (height / 2))))));
}