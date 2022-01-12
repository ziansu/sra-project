private void stopScanInternal() {
    mCamera.stopAutoFocus();
    if ((mDecodeThread) != null) {
        mDecodeThread.stopDecode();
    }
    mDecodeStateHandler.setState(wuxian.me.zxingscanner.QRCodeScannerImpl.DecodeStateHandler.SUCCESS);
}