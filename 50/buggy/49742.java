public void write(java.lang.String s, int off, int len) {
    writtenBytes += countBytes(s.substring(off, len));
    writtenChars += len;
    super.write(s, off, len);
}