private void writeVersion() {
    try {
        final java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry(IFormat.FILE_VERSION);
        zipOutputStream.putNextEntry(zipEntry);
        final java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(zipOutputStream);
        final java.lang.String version = IFormat.VERSION_1100;
        dataOutputStream.writeInt(version.length());
        dataOutputStream.writeChars(version);
        dataOutputStream.flush();
        zipOutputStream.closeEntry();
    } catch (final java.lang.Exception e) {
        e.printStackTrace();
    }
}