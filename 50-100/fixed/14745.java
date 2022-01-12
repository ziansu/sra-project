public void addNumber(long number, int bits) {
    if (!(writing))
        throw new java.lang.IllegalStateException("Not writing file!");
    
    if (bits < 1)
        throw new java.lang.IllegalArgumentException("Cannot write a number with less then 1 bit!");
    
    if (bits > 64)
        throw new java.lang.IllegalArgumentException("Cannot write a number with more then 64 bits!");
    
    long a;
    for (int i = bits - 1; i >= 0; i--) {
        a = power(i);
        addBit(((number & a) == a));
    }
}