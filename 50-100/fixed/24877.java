@java.lang.Override
public long[] relValues(java.lang.String relationName) {
    org.mwdb.plugin.KResolver.KNodeState resolved = this._resolver.resolveState(this, true);
    if (resolved != null) {
        long[] result = ((long[]) (resolved.get(this._resolver.stringToLongKey(relationName))));
        return result == null ? new long[0] : result;
    }else {
        throw new java.lang.RuntimeException(KConstants.CACHE_MISS_ERROR);
    }
}