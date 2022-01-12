@java.lang.Override
public void run() {
    java.util.zip.ZipOutputStream zos = client.getTxZipOutputStream();
    java.io.File txLogFileRaw = client.getTxLogFileRaw();
    try {
        if (zos != null) {
            zos.closeEntry();
            zos.close();
        }
        if (txLogFileRaw.exists()) {
            txLogFileRaw.delete();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}