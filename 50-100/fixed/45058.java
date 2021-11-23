@java.lang.Override
public boolean equals(@javax.annotation.Nullable
java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if ((obj == null) || ((getClass()) != (obj.getClass())))
        return false;
    
    com.beijunyi.parallelgit.utils.VirtualDirCacheEntry that = ((com.beijunyi.parallelgit.utils.VirtualDirCacheEntry) (obj));
    return (path.equals(that.path)) && ((regularFile) == (that.regularFile));
}