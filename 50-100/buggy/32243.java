@java.lang.Override
public void onCharacteristicWrite(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        mProgress.onProgress(gatt, characteristic, status, mMAXByteChunkToWrite);
        if (!(mSplitter.hasNext())) {
            writeChunk(gatt, characteristic);
        }else {
            mProgress.onComplete();
        }
    }else {
        mProgress.onError(new java.lang.RuntimeException(("Characteristic Write Failed: " + status)));
    }
}