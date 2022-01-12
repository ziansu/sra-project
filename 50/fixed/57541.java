public com.naver.svngit.TreeBuilder add(java.lang.String path, org.eclipse.jgit.lib.ObjectId blobId) {
    addings.put(path, blobId);
    return this;
}