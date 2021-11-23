public byte readMemory() {
    if (((index) < (memoryArray.length)) && ((index) >= 0)) {
        java.lang.System.out.println(("Index now: " + (index)));
        java.lang.System.out.println(("index calculation: " + ((index) % (memoryArray.length))));
        byte b = memoryArray[((index) % (memoryArray.length))];
        (index)++;
        return b;
    }else {
        throw new java.lang.IndexOutOfBoundsException("Index is out of bounds");
    }
}