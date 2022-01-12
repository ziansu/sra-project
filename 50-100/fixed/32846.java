@org.apache.poi.util.SuppressForbidden(value = "TODO: Fix this to not use reflection (it will break in Java 9)! " + "Better would be to wrap *before* instead of tyring to insert wrapper afterwards.")
public org.apache.poi.openxml4j.util.ZipSecureFile.ThresholdInputStream run() {
    try {
        java.lang.reflect.Field f = java.io.FilterInputStream.class.getDeclaredField("in");
        f.setAccessible(true);
        java.io.InputStream oldInner = ((java.io.InputStream) (f.get(zipIS)));
        org.apache.poi.openxml4j.util.ZipSecureFile.ThresholdInputStream newInner = new org.apache.poi.openxml4j.util.ZipSecureFile.ThresholdInputStream(oldInner, null);
        f.set(zipIS, newInner);
        return newInner;
    } catch (java.lang.Exception ex) {
        org.apache.poi.openxml4j.util.ZipSecureFile.logger.log(POILogger.WARN, "SecurityManager doesn't allow manipulation via reflection for zipbomb detection - continue with original input stream", ex);
    }
    return null;
}