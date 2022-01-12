private boolean mergeLiteralWordInNextRunningLength(boolean value, int lw, int pos, int wordPosition) {
    int nextRLWPos = (pos + lw) + 1;
    if ((lw == wordPosition) && (nextRLWPos < (this.buffer.sizeInWords()))) {
        int nextRl = com.googlecode.javaewah32.RunningLengthWord32.getRunningLength(this.buffer, nextRLWPos);
        boolean nextRb = com.googlecode.javaewah32.RunningLengthWord32.getRunningBit(this.buffer, nextRLWPos);
        return (value == nextRb) || (nextRl == 0);
    }
    return false;
}