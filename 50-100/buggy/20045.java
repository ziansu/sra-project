public boolean upload() {
    if ((currentFileState) == (FileClient.FileState.WriteOwned)) {
        currentFileState = FileClient.FileState.Invalid;
    }else
        if ((currentFileState) == (FileClient.FileState.ReleaseOwnership)) {
            currentFileState = FileClient.FileState.ReadShared;
        }
    
    try {
        if (server.upload(clientIP, currentFileName, fileContents)) {
            return true;
        }
        return false;
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
        return false;
    }
    return true;
}