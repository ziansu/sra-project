private java.lang.Long incrementAndSetValue(final byte[] key, final byte[] field, final long value, byte[] elementToUpdate) {
    try {
        long longValue = com.lordofthejars.nosqlunit.redis.embedded.ByteArrayIncrement.incrementValue(value, elementToUpdate);
        hset(key, field, java.lang.Long.toString(value).getBytes("UTF-8"));
        return longValue;
    } catch (java.io.UnsupportedEncodingException e) {
        throw new java.lang.UnsupportedOperationException("ERR value is not an integer");
    } catch (java.lang.NumberFormatException e) {
        throw new java.lang.UnsupportedOperationException("ERR value is not an integer");
    }
}