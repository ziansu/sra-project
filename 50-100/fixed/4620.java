private void scannerPrint(int type) throws java.lang.Exception {
    mCancelSignal = new android.support.v4.os.CancellationSignal();
    com.dax.demo.fingerprint.SymmetricCryptoObjectHelper cryptoHelper = new com.dax.demo.fingerprint.SymmetricCryptoObjectHelper(this);
    android.support.v4.hardware.fingerprint.FingerprintManagerCompat.CryptoObject cryptoObject = cryptoHelper.buildCryptoObject(type);
    mFingerManager.authenticate(cryptoObject, 0, mCancelSignal, mCallback, null);
}