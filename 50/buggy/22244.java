private void stopScanInternal() {
    mCamera.stopAutoFocus();
    mDecodeThread.stopDecode();
    mDecodeStateHandler.setState(wuxian.me.zxingscanner.QRCodeScannerImpl.DecodeStateHandler.SUCCESS);
}