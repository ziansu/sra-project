@org.junit.Test
public void testGetFileSizeMethod() {
    long fileSize = 100;
    net.codehobby.fileinfo.FileData fd = new net.codehobby.fileinfo.FileData();
    fd.setFileSize(fileSize);
    assertTrue("setFileSize should return the file size", (fileSize == (fd.getFileSize())));
}