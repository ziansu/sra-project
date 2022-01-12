@java.lang.Override
public boolean isHardwareDetected(long deviceId, java.lang.String opPackageName) {
    if (!(canUseFingerprint(opPackageName, false))) {
        return false;
    }
    return (mHalDeviceId) != 0;
}