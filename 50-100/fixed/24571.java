public boolean createDirectory(java.lang.String directoryRequest) {
    boolean status = false;
    establishConnection();
    try {
        boolean directoryExists = ftpClient.changeWorkingDirectory(directoryRequest);
        if (directoryExists) {
            java.lang.System.err.println("Directory already exists");
            disconnect();
            return status;
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    try {
        ftpClient.makeDirectory(directoryRequest);
        status = true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    disconnect();
    return status;
}