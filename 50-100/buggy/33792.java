public static org.infinity.resource.graphics.PvrDecoder loadPvr(java.lang.String fileName) {
    if (fileName == null) {
        throw new java.lang.NullPointerException();
    }
    try {
        java.lang.String key = fileName.toUpperCase(java.util.Locale.ENGLISH);
        org.infinity.resource.graphics.PvrDecoder decoder = org.infinity.resource.graphics.PvrDecoder.getCachedPvrDecoder(key);
        if (decoder != null) {
            return decoder;
        }else {
            return org.infinity.resource.graphics.PvrDecoder.createPvrDecoder(key, org.infinity.util.io.StreamUtils.getInputStream(org.infinity.util.io.FileManager.resolve(fileName)));
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}