public long skip(long total) throws java.io.IOException {
    if (total < 0) {
        return 0;
    }
    long toSkip = total;
    while (toSkip > 0) {
        long skipped = is.skip(toSkip);
        if (skipped > 0) {
            toSkip -= skipped;
        }else {
            int testEofByte = is.read();
            if (testEofByte == (-1)) {
                break;
            }else {
                toSkip--;
            }
        }
    } 
    return total - toSkip;
}