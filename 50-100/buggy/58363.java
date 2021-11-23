private void diskonekPerangkat() {
    if (mConnected) {
        try {
            if ((mBluetoothSocket) != null) {
                mBluetoothSocket.close();
                ((doab.uin.mvb.MyApplication) (getApplication())).setmBluetoothSocket(null);
            }
        } catch (java.io.IOException e) {
            ((doab.uin.mvb.MyApplication) (getApplication())).setmBluetoothSocket(null);
        }
    }
    ((doab.uin.mvb.MyApplication) (getApplication())).setmConnected(false);
}