private void scannerPrint() throws java.lang.Exception {
    mCancelSignal = new android.support.v4.os.CancellationSignal();
    com.dax.demo.fingerprint.SymmetricCryptoObjectHelper cryptoHelper = new com.dax.demo.fingerprint.SymmetricCryptoObjectHelper();
    android.support.v4.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject = cryptoHelper.buildCryptoObject();
    android.util.Log.d(com.dax.demo.fingerprint.MainActivity.TAG, ("cryptoObject --> " + (cryptoObject == null ? null : cryptoObject.toString())));
    mFingerManager.authenticate(cryptoObject, 0, mCancelSignal, mCallback, null);
}