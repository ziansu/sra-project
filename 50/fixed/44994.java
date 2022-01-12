public java.util.ArrayList<dennouneko.booruview.ImageCache.FileInfo> indexFiles(java.lang.String path) {
    java.util.ArrayList<dennouneko.booruview.ImageCache.FileInfo> tmp = new java.util.ArrayList<dennouneko.booruview.ImageCache.FileInfo>();
    indexFiles(path, tmp);
    java.util.Collections.sort(tmp, new dennouneko.booruview.ImageCache.FileInfoComparator(false));
    return tmp;
}