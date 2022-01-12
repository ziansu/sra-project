private void fillBuffer() throws java.io.IOException {
    do {
        java.lang.String line = readBuffer(in, delimiter);
        if (line == null) {
            EOF = true;
            return ;
        }else {
            buffer = whiteCharPattern.split(line);
            posInBuffer = 0;
            posInWord = 0;
        }
    } while ((buffer.length) == 0 );
}