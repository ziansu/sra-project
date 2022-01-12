@java.lang.Override
public boolean next() throws java.io.IOException {
    assertPagedFileStillMapped();
    if ((nextPageId) > (lastPageId)) {
        if (((pf_flags) & (org.neo4j.io.pagecache.PagedFile.PF_NO_GROW)) != 0) {
            return false;
        }else {
            pagedFile.increaseLastPageIdTo(nextPageId);
        }
    }
    unpinCurrentPage();
    pin(nextPageId, true);
    currentPageId = nextPageId;
    (nextPageId)++;
    return true;
}