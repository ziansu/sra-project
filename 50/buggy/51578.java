private void rebootRecoveryWithCommand(java.lang.String command, boolean update) {
    try {
        mService.rebootRecoveryWithCommand(command, update);
    } catch (android.os.RemoteException ignored) {
    }
}