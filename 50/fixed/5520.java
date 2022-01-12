private void withClosedResourceResolver() {
    doReturn(false).when(this.resolver).isLive();
}