public static java.lang.String fixPath(java.lang.String path) {
    java.lang.String prefix;
    java.lang.String suffix;
    prefix = path.substring(0, path.lastIndexOf("/"));
    suffix = path.substring(path.lastIndexOf("/"));
    prefix = prefix.replaceAll("%20", " ");
    return prefix.concat(suffix);
}