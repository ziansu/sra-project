public long readBytes(int length, boolean sext) throws java.io.IOException {
    read(bytes, 0, length);
    long value = 0;
    for (int i = 0; i < length; i++)
        value += (sext) ? makeFieldSext(i) : makeField(i);
    
    return value;
}