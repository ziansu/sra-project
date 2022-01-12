private boolean isInMustCacheList(java.lang.String path) throws java.io.IOException {
    if ((mUserMustCacheList) == null) {
        try {
            mUserMustCacheList = new alluxio.collections.PrefixList(mFileSystem.getUserMustCacheList());
        } catch (alluxio.exception.AlluxioException e) {
            throw new java.io.IOException(e);
        }
    }
    return mUserMustCacheList.inList(path);
}