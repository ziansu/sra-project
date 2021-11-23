private void testFindRange(final org.archive.wayback.resourceindex.distributed.AlphaPartitionedIndex apIndex, final java.lang.String url, final java.lang.String wantGroup) throws org.apache.commons.httpclient.URIException, org.archive.wayback.exception.BadQueryException, org.archive.wayback.exception.ResourceIndexNotAvailableException {
    org.archive.wayback.core.WaybackRequest r = new org.archive.wayback.core.WaybackRequest();
    r.setRequestUrl(apIndex.canonicalize(url));
    org.archive.wayback.resourceindex.distributed.RangeGroup g = apIndex.getRangeGroupForRequest(r);
    assertEquals(wantGroup, g.getName());
}