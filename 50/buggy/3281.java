public void close(boolean closeSocket) {
    if (!(mIsClosed)) {
        mBluetoothSocketIoThread.close(closeSocket);
        android.util.Log.d(org.thaliproject.nativetest.app.model.Connection.TAG, "close: Closed");
        mIsClosed = true;
    }
}