public void setUp() throws java.lang.Exception {
    super.setUp();
    java.io.File inputFile = new java.io.File(testFileRaw);
    byte[] fileData = new byte[((int) (inputFile.length()))];
    java.io.DataInputStream dis = new java.io.DataInputStream(new java.io.FileInputStream(inputFile));
    dis.readFully(fileData);
    edu.berkeley.cs.succinct.buffers.SuccinctBuffer sBuf = new edu.berkeley.cs.succinct.buffers.SuccinctBuffer(fileData);
    sBuf.writeToFile(testFileSuccinct);
    sCore = new edu.berkeley.cs.succinct.streams.SuccinctStream(new org.apache.hadoop.fs.Path(testFileSuccinct));
}