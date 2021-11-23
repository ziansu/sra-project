public java.lang.String readMemory(int address) {
    int index = binaryToDecimal(address);
    return dataMemory.get(index);
}