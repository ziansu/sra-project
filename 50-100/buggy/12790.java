@java.lang.Override
public java.lang.Byte next() {
    try {
        if (this.hasNext()) {
            return new java.lang.Byte(((byte) (bufferedInputStream.read())));
        }else {
            throw new java.util.NoSuchElementException("No more data left in the file");
        }
    } catch (java.io.IOException e) {
        com.google.common.base.Throwables.propagate(e);
        return null;
    }
}