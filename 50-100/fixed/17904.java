public void close() throws java.io.IOException {
    if ((out) != null) {
        fileChannel.force(true);
        out.close();
    }else {
        java.io.File extFile = new java.io.File(pathName);
        if (!(extFile.exists())) {
            throw new java.io.IOException(("File must be created: " + (pathName)));
        }
        block.setNumBytes(extFile.length());
    }
    socketChannel.close();
}