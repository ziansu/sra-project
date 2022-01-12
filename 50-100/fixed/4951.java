private int readNum(byte[] sbuf, int pos, int numBytes) {
    int result = 0;
    for (int i = 0; i < numBytes; i++)
        result = (result << 8) + ((sbuf[(pos + i)]) & 255);
    
    return result;
}