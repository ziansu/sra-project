@java.lang.Override
public void onMatrixError(org.matrix.androidsdk.rest.model.MatrixError e) {
    org.matrix.androidsdk.util.Log.e(im.vector.util.VectorCallManager.LOG_TAG, ("## startIpCall(): onMatrixError Msg=" + (e.getLocalizedMessage())));
    if (e instanceof org.matrix.androidsdk.crypto.MXCryptoError) {
        org.matrix.androidsdk.crypto.MXCryptoError cryptoError = ((org.matrix.androidsdk.crypto.MXCryptoError) (e));
        if (MXCryptoError.UNKNOWN_DEVICES_CODE.equals(cryptoError.errcode)) {
            callback.onStartCallFailed(MXCryptoError.UNKNOWN_DEVICES_CODE);
        }else {
            callback.onStartCallFailed(e.getLocalizedMessage());
        }
    }else {
        callback.onStartCallFailed(e.getLocalizedMessage());
    }
}