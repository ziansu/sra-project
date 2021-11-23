@java.lang.Override
public void close() throws java.io.IOException {
    if ((output) != null) {
        writeBytes("DONE");
        writeInt(java.lang.Integer.reverseBytes(0));
        output.flush();
        output.close();
        output = null;
    }
}