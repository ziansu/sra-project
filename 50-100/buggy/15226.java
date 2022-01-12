@java.lang.Override
public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int userId, java.lang.String opPackageName) {
    if (!(canUseFingerprint(opPackageName))) {
        return java.util.Collections.emptyList();
    }
    int effectiveUserId = getEffectiveUserId(userId);
    return this.getEnrolledFingerprints(effectiveUserId);
}