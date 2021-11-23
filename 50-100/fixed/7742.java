public static java.lang.String encodePath(java.lang.String path) {
    if ((path == null) || ((path.length()) == 0))
        return path;
    
    java.lang.StringBuilder buf = org.eclipse.jetty.util.URIUtil.encodePath(null, path, 0);
    return buf == null ? path : buf.toString();
}