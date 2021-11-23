private void assertLoadedNoUrl() {
    assertTrue("Requested a search or preload when none was expected!", (((mFakeServer) == null) || ((mFakeServer.getLoadedUrl()) == null)));
}