public void createDirectory(java.lang.String directoryRequest) {
    establishConnection();
    try {
        boolean directoryExists = ftpClient.changeWorkingDirectory(directoryRequest);
        if (directoryExists) {
            java.lang.System.err.println("Directory already exists");
            disconnect();
            return ;
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    try {
        ftpClient.makeDirectory(directoryRequest);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    disconnect();
}