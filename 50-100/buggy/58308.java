@java.lang.Override
public void getContents(java.io.OutputStream receiver) {
    java.io.FileInputStream fis = null;
    try {
        fis = new java.io.FileInputStream(this.getTrackedFile());
        org.apache.commons.io.IOUtils.copy(fis, receiver);
    } catch (java.io.FileNotFoundException e) {
        throw new java.lang.RuntimeException(e.getCause());
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e.getCause());
    } finally {
        org.apache.commons.io.IOUtils.closeQuietly(fis);
    }
}