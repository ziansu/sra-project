@java.lang.Override
public java.io.OutputStream getBlockOS(int x, int y, int z) throws java.io.IOException {
    if ((osBD) != null) {
        return osBD;
    }
    synchronized(this) {
        bdFile.getParentFile().mkdirs();
        bdFile.createNewFile();
        osBD = getCompressedOS(new java.io.FileOutputStream(bdFile));
        writeHeader(osBD, x, y, z);
        return osBD;
    }
}