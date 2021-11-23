public float getFirmwareVersion() {
    byte[] rawDescs = mConnection.getRawDescriptors();
    return java.lang.Float.parseFloat((((java.lang.Integer.toHexString(rawDescs[13])) + ".") + (java.lang.Integer.toHexString(rawDescs[12]))));
}