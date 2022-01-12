public void releaseToken(java.lang.String key) {
    synchronized(key.intern()) {
        int count = decreaseTokenInUse(key, 1);
        logger.info(((("release key: " + key) + ", in using: ") + count));
        if (count == 0) {
            synchronized(tokenInUseMapping) {
                tokenInUseMapping.remove(key);
            }
            logger.info((("key: " + key) + " is not in using, remove it from KEY IN USING COUNTER"));
        }
    }
}