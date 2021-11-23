public void readData() {
    byte[] dataChunk = new byte[((int) (MAX_BUFFER_SIZE))];
    mbb.get(dataChunk);
    chunkParser.setMetaData(dataChunk);
    chunkParser.readChunk();
    java.util.HashMap<java.lang.String, java.util.List<io.openmessaging.demo.DefaultBytesMessage>> table = chunkParser.getTable();
    java.lang.System.out.println("read over");
}