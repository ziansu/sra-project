void startListening(android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoObject) {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(context, android.Manifest.permission.USE_FINGERPRINT)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))
        cancellationSignal = new android.os.CancellationSignal();
    
    isCancelled = false;
    fingerprintManager.authenticate(cryptoObject, cancellationSignal, 0, this, null);
}