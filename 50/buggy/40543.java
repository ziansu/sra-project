public byte[] getDeviceHalfOfKey() {
    byte[] result = new byte[mDeviceHalfOfKeyLength];
    java.lang.System.arraycopy(mSecretKeyByteArray, ((mPhoneHalfOfKeyLength) - 1), result, 0, mDeviceHalfOfKeyLength);
    return result;
}