public boolean upload(java.lang.String nyIpName, java.lang.String fileName, FileContents contents) {
    java.lang.System.out.println(("Received file! Name: " + fileName));
    ServerCachedFile serverFile = getFile(fileName);
    if ((serverFile.state) == (FileState.Not_Shared)) {
        java.lang.System.out.println("File not shared!");
        return false;
    }
    serverFile.fileContents = contents;
    writeFile(serverFile);
    invalidateClients(fileName, serverFile.currentWriter);
    serverFile.currentWriter = null;
    serverFile.state = FileState.Not_Shared;
    return true;
}