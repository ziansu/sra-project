public void getFileWP(java.net.Socket socket, java.lang.String pathToSaveTo, java.lang.String fileName, long fileSize) {
    studyproject.API.Lvl.Mid.GetFileWPThread getFileWPThread = new studyproject.API.Lvl.Mid.GetFileWPThread(socket, pathToSaveTo, fileName, fileSize);
    getFileWPThread.run();
}