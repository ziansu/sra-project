@java.lang.Override
public boolean connect(java.lang.String device, java.lang.String password) {
    try {
        java.lang.Thread.sleep(2000);
    } catch (java.lang.InterruptedException e) {
        return false;
    }
    for (java.lang.String credential : com.lasalle.lsmaker_remote.services.impl.BluetoothConnection.DUMMY_CREDENTIALS) {
        java.lang.String[] pieces = credential.split(":");
        if (pieces[0].equals(deviceName)) {
            return pieces[1].equals(pincode);
        }
    }
    com.lasalle.lsmaker_remote.services.impl.BluetoothConnection.ourInstance.deviceName = device;
    com.lasalle.lsmaker_remote.services.impl.BluetoothConnection.ourInstance.pincode = password;
    return true;
}