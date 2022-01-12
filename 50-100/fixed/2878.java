public me.doubledutch.lazyjson.LazyObject put(java.lang.String key, java.lang.String value) throws me.doubledutch.lazyjson.LazyException {
    if (value == null) {
        remove(key);
        return this;
    }
    me.doubledutch.lazyjson.LazyNode child = null;
    if (shouldQuoteString(value)) {
        child = appendAndSetDirtyString(LazyNode.VALUE_ESTRING, quoteString(value));
    }else {
        child = appendAndSetDirtyString(LazyNode.VALUE_STRING, value);
    }
    attachField(key, child);
    return this;
}