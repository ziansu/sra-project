public void sendPart(java.io.RandomAccessFile file, int offset, int len) throws java.io.IOException {
    byte[] data = new byte[len];
    file.read(data);
    out.writeInt(len);
    out.write(data, 0, len);
    out.flush();
}