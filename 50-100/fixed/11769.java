public void getBytes(java.io.OutputStream outputStream) throws java.io.IOException {
    java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(outputStream);
    java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.allocate(((java.lang.Long.BYTES) * 2));
    byteBuffer.putLong(id.getMostSignificantBits());
    byteBuffer.putLong(id.getLeastSignificantBits());
    bufferedOutputStream.write(byteBuffer.array());
    getBytesFromPedestrianInfo(personA, bufferedOutputStream);
    getBytesFromPedestrianInfo(personB, bufferedOutputStream);
    bufferedOutputStream.flush();
}