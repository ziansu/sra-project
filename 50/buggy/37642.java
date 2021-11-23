public byte[] convertToSendingPaket(long deviceID) {
    return convertToCMotionHeader(deviceID, floatArray2ByteArray(this.lastReceiveData));
}