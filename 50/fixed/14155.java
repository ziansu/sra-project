@java.lang.Override
public void write(char[] cbuf, int off, int len) throws java.io.IOException {
    java.lang.String newStr = new java.lang.String(cbuf);
    this.write(newStr, off, len);
}