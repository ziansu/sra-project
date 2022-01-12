public static byte[] read(java.lang.String filePath) {
    java.io.FileInputStream is = null;
    try {
        is = new java.io.FileInputStream(filePath);
        return com.simon.lib.cacheloader.util.IOUtils.read(is);
    } catch (java.io.FileNotFoundException e) {
    } catch (java.io.IOException e) {
    } catch (java.lang.OutOfMemoryError e) {
    } finally {
        if (is != null) {
            try {
                is.close();
            } catch (java.io.IOException e) {
            }
        }
    }
    return null;
}