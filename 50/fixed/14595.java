public T invalidate(java.lang.String url) {
    java.io.File file = getCachedFile(url);
    if (file != null)
        file.delete();
    
    return self();
}