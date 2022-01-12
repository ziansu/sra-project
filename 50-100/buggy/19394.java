sdfs.namenode.NameNodeResponse handleOpenReadOnly(sdfs.namenode.NameNodeRequest request) {
    sdfs.namenode.NameNodeResponse response = new sdfs.namenode.NameNodeResponse(NameNodeResponse.Type.OPEN_READ_ONLY);
    java.lang.String fileUri = request.getString();
    try {
        java.lang.System.out.println("opening read-only file...");
        sdfs.namenode.SDFSFileChannel sdfsFileChannel = nameNode.openReadonly(fileUri);
        java.lang.System.out.println("opened!");
        java.lang.System.out.println("sending response...");
        response.setSdfsFileChannel(sdfsFileChannel);
    } catch (java.io.FileNotFoundException e) {
        response.setFileNotFoundException(new java.io.FileNotFoundException());
        e.printStackTrace();
    }
    return response;
}