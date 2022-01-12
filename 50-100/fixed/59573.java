public byte[] get(byte[] key) {
    byte[] result = null;
    byte[] byteKey = key;
    try {
        result = db.get(byteKey);
    } catch (com.yahoo.ads.pb.store.RocksDBException e) {
        logger.debug("error getting key {}", key, e);
    } catch (java.lang.Exception e) {
        logger.debug("error getting key {}", key, e);
        return null;
    }
    return result;
}