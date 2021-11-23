@org.junit.Test
public void writeTest() throws java.lang.Exception {
    java.io.RandomAccessFile randomAccessFile = null;
    try {
        randomAccessFile = new java.io.RandomAccessFile("RandomAccessFileWriteTest", "rw");
        randomAccessFile.writeBytes("hello");
        randomAccessFile.writeInt(54);
        randomAccessFile.writeBytes("world");
        randomAccessFile.writeInt(57);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        randomAccessFile.close();
    }
}