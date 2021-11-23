@java.lang.Override
public java.io.OutputStream create(java.lang.String path, alluxio.underfs.options.CreateOptions options) throws java.io.IOException {
    mPermanentPath = path;
    mTemporaryPath = alluxio.util.io.PathUtils.temporaryFileName(mNonce, path);
    return new alluxio.underfs.AtomicFileOutputStream(createNonAtomic(mTemporaryPath, options), this);
}