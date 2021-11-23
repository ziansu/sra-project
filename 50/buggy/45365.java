public static final <K, V> de.mxro.async.map.AsyncMap<K, V> encodeKeysForCaseInsensitiveStorage(final de.mxro.async.map.AsyncMap<K, V> map) {
    de.mxro.async.map.AsyncMaps.filterKeys(new de.mxro.async.map.sql.internal.EncodeCaseInsensitiveKey(), map);
}