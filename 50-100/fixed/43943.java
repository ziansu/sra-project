private void fillBuffer() throws java.io.IOException {
    do {
        java.lang.String line = readBuffer(in, delimiter);
        if (line == null) {
            buffer = new java.lang.String[0];
            posInBuffer = 0;
            return ;
        }else {
            buffer = whiteCharPattern.split(line);
            posInBuffer = 0;
            posInWord = 0;
        }
    } while ((buffer.length) == 0 );
}