public synchronized void reportResult(boolean successful, java.lang.String result) {
    (mFinishedThreadCount)++;
    if (successful && (!(mSuccessfullyDecoded))) {
        mSuccessfullyDecoded = true;
        if (com.nightout.idscanner.imageutils.pdf417.PDF417Helper.DEBUG_DECODE) {
            mScannerActivity.reportScannerBatchResponse(mSuccessfullyDecoded, result);
        }else {
            new com.nightout.idscanner.imageutils.pdf417.PDF417DataHandler().execute(result);
        }
    }
    if ((mFinishedThreadCount) == (com.nightout.idscanner.imageutils.pdf417.PDF417Helper.MAX_THREAD_COUNT)) {
        if (!(mSuccessfullyDecoded)) {
            mScannerActivity.reportScannerBatchResponse(false, null);
        }
        cleanup();
    }
}