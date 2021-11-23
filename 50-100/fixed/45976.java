public void writeNewId3ToMp3(java.lang.String path) {
    java.io.RandomAccessFile raff;
    try {
        raff = new java.io.RandomAccessFile(path, "rw");
        raff.seek(((raff.length()) - 128));
        raff.writeBytes(getNewId3Tag());
        raff.close();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
    }
}