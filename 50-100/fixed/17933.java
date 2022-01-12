private void flush() throws java.io.IOException {
    if (null != (buffer)) {
        final int p = buffer.position();
        buffer.limit(p);
        buffer.position(0);
        assert p == (buffer.remaining());
        file.write(buffer, position);
        position += p;
    }
}