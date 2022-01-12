public void flush(int pad) throws java.io.IOException {
    if ((pad >= (count)) || ((((count) - pad) % 8) != 0))
        throw new java.lang.IllegalStateException("Bad padding");
    
    count -= pad;
    flushBuffer(0);
    value = 0;
    count = 0;
}