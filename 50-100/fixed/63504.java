public byte readMemory() {
    if (((index) < (memoryArray.length)) && ((index) >= 0)) {
        byte b = memoryArray[((index) % (memoryArray.length))];
        (index)++;
        return b;
    }else {
        throw new java.lang.IndexOutOfBoundsException("Index is out of bounds");
    }
}