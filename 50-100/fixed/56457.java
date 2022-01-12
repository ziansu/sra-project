public final org.giiwa.framework.web.FileItem getFile(java.lang.String name) {
    getFiles();
    java.lang.Object o = uploads.get(name);
    if (o instanceof org.giiwa.framework.web.FileItem) {
        return ((org.giiwa.framework.web.FileItem) (o));
    }else
        if (o instanceof java.util.List) {
            java.util.List<org.giiwa.framework.web.FileItem> list = ((java.util.List<org.giiwa.framework.web.FileItem>) (o));
            return list.get(((list.size()) - 1));
        }
    
    return null;
}