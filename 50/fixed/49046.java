public byte[] getValue() {
    if ((mCharacteristic) == null)
        return null;
    
    return mCharacteristic.getValue();
}