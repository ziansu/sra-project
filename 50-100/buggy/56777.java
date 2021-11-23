public byte getNextByte() throws java.io.IOException {
    if (!(queued_bytes.isEmpty())) {
        java.lang.Byte element = queued_bytes.element();
        queued_bytes.remove();
        return element;
    }else {
        throw new java.io.IOException("BluetoothSppClient::ReadThread::getNextByte: attempt to get element when queue empty");
    }
}