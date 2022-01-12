private static byte[] internalTowsComplement(byte[] bin) {
    byte[] b = org.hetc.binaryNumber.BinaryNumber.invert(bin);
    b = org.hetc.binaryNumber.BinaryNumber.internalAdd(b, org.hetc.binaryNumber.BinaryNumber.of(1).binary);
    return b;
}