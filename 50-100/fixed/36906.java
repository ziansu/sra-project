@java.lang.Override
public boolean next() throws java.io.IOException {
    unpinCurrentPage();
    assertPagedFileStillMapped();
    if ((nextPageId) > (lastPageId)) {
        return false;
    }
    pin(nextPageId, false);
    currentPageId = nextPageId;
    (nextPageId)++;
    return true;
}