@java.lang.Override
public void run() {
    mFingerprintCancelSignal.refreshCancellationSignal();
    performStartFingerprintLogic(mSignatureToAuth);
}