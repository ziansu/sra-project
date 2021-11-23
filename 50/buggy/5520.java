private void withClosedResourceResolver() {
    org.mockito.Mockito.doReturn(false).when(this.resolver).isLive();
}