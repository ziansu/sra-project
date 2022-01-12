public static byte[] serialize(java.lang.Object object) {
    java.io.ObjectOutputStream oos = null;
    java.io.ByteArrayOutputStream baos = null;
    try {
        baos = new java.io.ByteArrayOutputStream();
        oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(object);
        return baos.toByteArray();
    } catch (java.lang.Exception e) {
        throw new org.apache.ibatis.cache.CacheException(e);
    }
}