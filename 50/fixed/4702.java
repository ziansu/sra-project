@java.lang.Override
public void setSwapper(org.neo4j.io.pagecache.PageSwapper swapper) {
    file = (swapper == null) ? null : swapper.file();
}