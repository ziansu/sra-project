public java.io.File file(java.lang.String key) {
    java.io.File f = mCache.newFile(key);
    if ((f != null) && (f.exists()))
        return f;
    
    return null;
}