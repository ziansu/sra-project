public void encode(long i) throws java.io.IOException {
    outputStream.write(org.benjamin.Bencoder.INTEGER_MARK);
    outputStream.write(java.lang.Long.toString(i).getBytes());
    outputStream.write(org.benjamin.Bencoder.END_MARK);
}