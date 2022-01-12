public byte[] getPersistentData(java.lang.String key) {
    if ((ariel.device.ArielHardwareManager.sService) == null) {
        android.util.Log.w(ariel.device.ArielHardwareManager.TAG, "not connected to ArielHardwareService");
        return null;
    }
    try {
        return ariel.device.ArielHardwareManager.sService.getPersistentData(key);
    } catch (android.os.RemoteException e) {
        android.util.Slog.w("ArielHardwareManager", "warning: no ariel hardware service");
        return null;
    }
}