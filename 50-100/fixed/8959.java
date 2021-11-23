public void setUp() throws java.lang.Exception {
    super.setUp();
    java.io.File inputFile = new java.io.File(testFileRaw);
    byte[] fileData = new byte[((int) (inputFile.length()))];
    java.io.DataInputStream dis = new java.io.DataInputStream(new java.io.FileInputStream(inputFile));
    dis.readFully(fileData);
}