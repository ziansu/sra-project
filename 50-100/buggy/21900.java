@java.lang.Override
public com.google.devtools.build.lib.remote.RemoteProtocol.ContentDigest uploadFileContents(com.google.devtools.build.lib.vfs.Path file) throws java.io.IOException, java.lang.InterruptedException {
    if (!(file.exists())) {
        return null;
    }
    com.google.devtools.build.lib.remote.RemoteProtocol.ContentDigest digest = com.google.devtools.build.lib.remote.ContentDigests.computeDigest(file);
    if (isBlacklisted(file)) {
        cache.putFile(com.google.devtools.build.lib.remote.ContentDigests.toHexString(digest), file);
    }
    return digest;
}