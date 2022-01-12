public static org.eclipse.kura.linux.bluetooth.util.BluetoothProcess startSession(java.lang.String address, org.eclipse.kura.linux.bluetooth.util.BluetoothProcessListener listener) {
    java.lang.String[] command = new java.lang.String[]{ org.eclipse.kura.linux.bluetooth.util.BluetoothUtil.GATTTOOL , "-b" , address , "-I" };
    org.eclipse.kura.linux.bluetooth.util.BluetoothProcess proc = null;
    try {
        proc = org.eclipse.kura.linux.bluetooth.util.BluetoothUtil.exec(command, listener);
    } catch (java.lang.Exception e) {
        org.eclipse.kura.linux.bluetooth.util.BluetoothUtil.s_logger.error("Error executing command: ", command, e);
    }
    return proc;
}