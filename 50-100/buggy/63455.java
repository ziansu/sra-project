public void getFile(java.lang.String user, java.lang.String checksum, java.lang.String localPath, int startIndex, int endIndex) {
    studyproject.API.Lvl.Mid.FileConnectionThread fileConnectionThread = new studyproject.API.Lvl.Mid.FileConnectionThread(getUserConnectionInfo(user), checksum, getFileSize(checksum), localPath, startIndex, endIndex);
    fileConnectionThread.run();
}