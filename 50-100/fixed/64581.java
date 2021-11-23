@java.lang.Override
public synchronized void write(byte[] b, int off, int len) throws java.io.IOException {
    if ((StrBuffer) == null) {
        com.necla.am.zwutils.Misc.Misc.FAIL("%s: Output stream already closed", Name);
    }
    StrBuffer.append(new java.lang.String(b, off, len));
    flushln(false);
}