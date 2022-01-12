public void close(boolean closeSocket) {
    if (!(mIsClosed)) {
        mBluetoothSocketIoThread.close(true, closeSocket);
        android.util.Log.d(org.thaliproject.nativetest.app.model.Connection.TAG, "close: Closed");
        mIsClosed = true;
    }
}