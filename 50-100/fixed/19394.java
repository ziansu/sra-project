sdfs.namenode.NameNodeResponse handleOpenReadOnly(sdfs.namenode.NameNodeRequest request) {
    sdfs.namenode.NameNodeResponse response = new sdfs.namenode.NameNodeResponse(NameNodeResponse.Type.OPEN_READ_ONLY);
    java.lang.String fileUri = request.getString();
    try {
        sdfs.namenode.SDFSFileChannel sdfsFileChannel = nameNode.openReadonly(fileUri);
        response.setSdfsFileChannel(sdfsFileChannel);
    } catch (java.io.FileNotFoundException e) {
        response.setFileNotFoundException(new java.io.FileNotFoundException());
        e.printStackTrace();
    }
    return response;
}