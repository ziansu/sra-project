public void close() throws java.io.IOException {
    if ((out) != null) {
        out.close();
        fileChannel.force(true);
    }else {
        java.io.File extFile = new java.io.File(pathName);
        if (!(extFile.exists())) {
            throw new java.io.IOException(("File must be created: " + (pathName)));
        }
        block.setNumBytes(extFile.length());
    }
    socketChannel.close();
}