@android.annotation.SuppressLint(value = "NewApi")
@android.support.annotation.RequiresPermission(value = Manifest.permission.USE_FINGERPRINT)
public final boolean areFingerprintsEnrolled() {
    return ((fingerprintManager) != null) && (fingerprintManager.hasEnrolledFingerprints());
}