public org.kohsuke.github.GHContent getLicenseContent() throws java.io.IOException {
    return root.retrieve().to(getApiTailUrl("license"), org.kohsuke.github.GHContent.class).wrap(this);
}