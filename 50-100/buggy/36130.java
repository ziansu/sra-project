@java.lang.Override
public int read(char[] cbuf, int off, int len) throws java.io.IOException {
    int count = 0;
    for (; count < len; count++) {
        cbuf[count] = buffer[(off + count)];
    }
    idx += off;
    idx += count;
    java.lang.System.out.println(((("MockReader::read(" + (java.lang.String.valueOf(cbuf))) + ")=") + (idx)));
    return count;
}