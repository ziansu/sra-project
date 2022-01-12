public static boolean setByteFile(java.lang.String fileName, java.lang.String hex) {
    if ((MockFTPServerJulia.fakeFtpServer.getFileSystem()) == null) {
        org.mockftpserver.fake.filesystem.FileSystem fileSystem = new org.mockftpserver.fake.filesystem.UnixFakeFileSystem();
        MockFTPServerJulia.fakeFtpServer.setFileSystem(fileSystem);
    }
    org.mockftpserver.fake.filesystem.FileEntry file = new org.mockftpserver.fake.filesystem.FileEntry(fileName);
    java.lang.System.out.println(hex);
    file.setContents(MockFTPServerJulia.hexStringToByteArray(hex));
    MockFTPServerJulia.fakeFtpServer.getFileSystem().add(file);
    return true;
}