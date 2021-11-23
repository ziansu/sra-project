@android.annotation.SuppressLint(value = "NewApi")
@android.support.annotation.RequiresPermission(value = Manifest.permission.USE_FINGERPRINT)
public final boolean areFingerprintsEnrolled() {
    if ((fingerprintManager) != null) {
        return fingerprintManager.hasEnrolledFingerprints();
    }else {
        return false;
    }
}