@java.lang.Override
public void seek(long n) throws java.io.IOException {
    inputStream.skip(n);
}