@java.lang.Override
public long[] relValues(java.lang.String relationName) {
    org.mwdb.plugin.KResolver.KNodeState resolved = this._resolver.resolveState(this, true);
    if (resolved != null) {
        return ((long[]) (resolved.get(this._resolver.stringToLongKey(relationName))));
    }else {
        throw new java.lang.RuntimeException(KConstants.CACHE_MISS_ERROR);
    }
}