@java.lang.Override
public boolean hasEnrolledFingerprints(int userId, java.lang.String opPackageName) {
    if (!(canUseFingerprint(opPackageName, false))) {
        return false;
    }
    int effectiveUserId = getEffectiveUserId(userId);
    return this.hasEnrolledFingerprints(effectiveUserId);
}