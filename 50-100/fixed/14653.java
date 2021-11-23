protected java.util.Map<java.lang.String, org.eclipse.egit.github.core.GistFile> sortFiles(final org.eclipse.egit.github.core.Gist gist) {
    java.util.Map<java.lang.String, org.eclipse.egit.github.core.GistFile> files = gist.getFiles();
    if ((files == null) || ((files.size()) < 2))
        return files;
    
    java.util.Map<java.lang.String, org.eclipse.egit.github.core.GistFile> sorted = new java.util.TreeMap<java.lang.String, org.eclipse.egit.github.core.GistFile>();
    sorted.putAll(files);
    return sorted;
}