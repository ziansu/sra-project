@java.lang.Override
public final void write(final int c) throws java.io.IOException {
    try {
        this.m_writer.write(c);
    } finally {
        this.m_textOut.append(((char) (c)));
    }
}