public java.lang.String readMemory(java.lang.String address) {
    int index = binaryToDecimal(address);
    java.lang.System.out.println(dataMemory.get(index).getClass());
    return dataMemory.get(index);
}