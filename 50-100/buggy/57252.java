@java.lang.Override
public void downloaded(final org.apache.karaf.features.internal.download.StreamProvider provider) throws java.lang.Exception {
    java.lang.String uri = provider.getUrl();
    if (org.apache.karaf.features.internal.service.Blacklist.isBundleBlacklisted(blacklistedBundles, uri)) {
        throw new java.lang.RuntimeException((("Bundle " + uri) + " is blacklisted"));
    }
    java.nio.file.Path path = systemDirectory.resolve(org.apache.karaf.profile.assembly.Builder.pathFromProviderUrl(uri));
    synchronized(provider) {
        java.nio.file.Files.createDirectories(path.getParent());
        java.nio.file.Files.copy(provider.getFile().toPath(), path, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }
}