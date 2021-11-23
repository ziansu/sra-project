@java.lang.Override
public boolean saveContentToFile(byte[] content, java.io.File fileForSave) {
    java.io.FileOutputStream fos;
    try {
        fos = new java.io.FileOutputStream(fileForSave);
        fos.write(content);
        return true;
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
        return false;
    } finally {
        com.avos.avoscloud.AVUtils.closeQuietly(fos);
    }
}