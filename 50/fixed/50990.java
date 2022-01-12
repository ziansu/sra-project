@java.lang.Override
public boolean hasNext() {
    try {
        return (bufferedInputStream.available()) > 0;
    } catch (java.io.IOException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
}