public final int addAssetPath(java.lang.String path) {
    synchronized(this) {
        int res = addAssetPathNative(path);
        if ((mStringBlocks) != null) {
            makeStringBlocks(mStringBlocks);
        }
        return res;
    }
}