@java.lang.Override
public void evicted(long filePageId, org.neo4j.io.pagecache.Page page) {
    if ((onEviction) != null) {
        onEviction.onEvict(filePageId, page);
    }
}