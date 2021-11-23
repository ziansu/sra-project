public void updatePersistentConfiguration(android.content.res.Configuration values) {
    enforceCallingPermission(android.Manifest.permission.CHANGE_CONFIGURATION, "updateConfiguration()");
    enforceCallingPermission(android.Manifest.permission.WRITE_SETTINGS, "updateConfiguration()");
    if (values == null) {
        throw new java.lang.NullPointerException("Configuration must not be null");
    }
    synchronized(this) {
        final long origId = android.os.Binder.clearCallingIdentity();
        updateConfigurationLocked(values, null, true);
        android.os.Binder.restoreCallingIdentity(origId);
    }
}