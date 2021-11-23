private boolean excludeFromFilter(java.lang.String path) {
    if (path == null)
        return false;
    
    if (!(path.matches(".*\\.(css|jpg|png|gif|js|svg|ttf|woff|woff2)$"))) {
        java.lang.System.out.println(("path: " + path));
        java.lang.System.out.println(path.matches(".*\\.(css|jpg|png|gif|js|svg|ttf|woff|woff2)$"));
    }
    return path.matches(".*\\.(css|jpg|png|gif|js|svg|ttf|woff|woff2)$");
}