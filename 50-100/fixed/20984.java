public static org.apache.poi.poifs.filesystem.POIFSFileSystem create(java.io.File file) throws java.io.IOException {
    org.apache.poi.poifs.filesystem.POIFSFileSystem tmp = new org.apache.poi.poifs.filesystem.POIFSFileSystem();
    java.io.FileOutputStream fout = new java.io.FileOutputStream(file);
    tmp.writeFilesystem(fout);
    fout.close();
    tmp.close();
    return new org.apache.poi.poifs.filesystem.POIFSFileSystem(file, false);
}