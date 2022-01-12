public int read(byte[] b, int off, int len) throws java.io.IOException {
    int end = len + off;
    int get = 0;
    int total = 0;
    for (int i = off; i < end; i += get) {
        get = raf.read(b, i, (end - i));
        if (get > 0)
            total += get;
        else
            break;
        
    }
    return total;
}