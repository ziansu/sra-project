@java.lang.Override
public boolean next() throws java.io.IOException {
    assertPagedFileStillMapped();
    if ((nextPageId) > (lastPageId)) {
        return false;
    }
    unpinCurrentPage();
    pin(nextPageId, false);
    currentPageId = nextPageId;
    (nextPageId)++;
    return true;
}