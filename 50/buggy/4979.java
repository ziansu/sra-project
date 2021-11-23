@java.lang.Override
public void write(byte[] b) throws java.io.IOException {
    out.write(new java.lang.String(b, this.charset));
    flush();
}