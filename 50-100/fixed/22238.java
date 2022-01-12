private static org.apache.commons.lang3.tuple.Pair<org.neo4j.index.gbptree.TreeState, org.neo4j.index.gbptree.TreeState> readStatePages(org.neo4j.io.pagecache.PagedFile pagedFile) throws java.io.IOException {
    org.apache.commons.lang3.tuple.Pair<org.neo4j.index.gbptree.TreeState, org.neo4j.index.gbptree.TreeState> states;
    try (org.neo4j.io.pagecache.PageCursor cursor = pagedFile.io(0L, PagedFile.PF_SHARED_READ_LOCK)) {
        states = org.neo4j.index.gbptree.TreeStatePair.readStatePages(cursor, IdSpace.STATE_PAGE_A, IdSpace.STATE_PAGE_B);
    }
    return states;
}