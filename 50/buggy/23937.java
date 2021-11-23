public java.io.File getNFSStorageRootDirectory() {
    return (nfsStoreBasedir) == null ? org.commonjava.indy.filer.def.conf.DefaultStorageProviderConfiguration.DEFAULT_NFS_BASEDIR : nfsStoreBasedir;
}