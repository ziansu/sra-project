private long writeLong(long offset, long value) {
    offset %= capacity();
    if ((nextOffset(offset, 8)) > offset)
        byteStore.writeLong(offset, value);
    else
        if (isBytesBigEndian)
            putLongB(offset, value);
        else
            putLongL(offset, value);
        
    
    return 8;
}