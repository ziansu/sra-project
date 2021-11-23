@java.lang.Override
public net.byteseek.io.reader.windows.Window getWindow(final long position) throws java.io.IOException {
    return (position >= 0) && (position < (windowBytes.length())) ? windowBytes : null;
}