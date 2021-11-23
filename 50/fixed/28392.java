public boolean send(final byte[] data) {
    if ((mWriteCharacteristic) == null) {
        return false;
    }
    mWriteCharacteristic.setValue(data);
    return mBGatt.writeCharacteristic(mWriteCharacteristic);
}