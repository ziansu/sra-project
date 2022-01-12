private void verifyResolverIsNotClosed() {
    verify(this.resolver, never()).close();
}