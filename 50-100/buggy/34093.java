protected java.io.File[] _listFiles(java.lang.Object filter) {
    java.lang.String[] files = _list(filter);
    if (files == null)
        return new java.io.File[0];
    
    java.io.File[] retval = new java.io.File[files.length];
    for (int i = 0; i < (files.length); i++)
        retval[i] = new org.infinispan.io.GridFile(files[i], metadataCache, chunk_size, fs);
    
    return retval;
}