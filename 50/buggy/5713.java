@java.lang.Override
public java.util.Iterator<org.apache.ignite.internal.processors.cache.GridCacheMapEntry> iterator() {
    return org.apache.ignite.internal.util.typedef.F.iterator0(map.values(), true, filter);
}