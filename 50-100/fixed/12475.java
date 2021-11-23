public java.lang.Object getObject(java.lang.String key) {
    java.lang.Object result = null;
    try {
        result = this.keyValue.get(key);
    } catch (java.util.ConcurrentModificationException e) {
        if (this.logger.error(this, "getObject", NetworkParserLog.ERROR_TYP_CONCURRENTMODIFICATION, key)) {
            throw e;
        }
    }
    return result;
}