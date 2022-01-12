private void rebootRecoveryWithCommand(java.lang.String command) {
    try {
        mService.rebootRecoveryWithCommand(command);
    } catch (android.os.RemoteException ignored) {
    }
}