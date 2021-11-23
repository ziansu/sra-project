public byte[] getDeviceHalfOfKey() {
    byte[] result = new byte[mDeviceHalfOfKeyLength];
    java.lang.System.arraycopy(mSecretKeyByteArray, mPhoneHalfOfKeyLength, result, 0, mDeviceHalfOfKeyLength);
    return result;
}