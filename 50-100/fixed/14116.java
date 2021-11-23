public static org.infinity.resource.graphics.PvrDecoder loadPvr(java.nio.file.Path file) {
    try {
        java.lang.String key = file.getFileName().toString();
        org.infinity.resource.graphics.PvrDecoder decoder = org.infinity.resource.graphics.PvrDecoder.getCachedPvrDecoder(key);
        if (decoder != null) {
            return decoder;
        }else {
            return org.infinity.resource.graphics.PvrDecoder.createPvrDecoder(key, org.infinity.util.io.StreamUtils.getInputStream(file));
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}