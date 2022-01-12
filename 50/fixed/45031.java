@java.lang.Override
public int read() {
    if ((size) > 0)
        return (readByte()) & 255;
    
    return -1;
}