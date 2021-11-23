@java.lang.Override
public int size() throws java.io.IOException {
    return ((int) (java.lang.Math.floor(((randomAccessFile.length()) / 12))));
}