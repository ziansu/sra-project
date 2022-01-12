private void assertContainsParameters(java.lang.String searchTerm, java.lang.String alternateTerm) {
    assertTrue((((mFakeServer.getSearchTermRequested()) == null) || ((mFakeServer.getLoadedUrl().contains(searchTerm)) && (mFakeServer.getLoadedUrl().contains(alternateTerm)))));
}