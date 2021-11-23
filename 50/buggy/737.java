@java.lang.Override
public void writeTo(java.io.OutputStream outstream) throws java.io.IOException {
    write(null, outstream);
    outstream.flush();
    outstream.close();
}