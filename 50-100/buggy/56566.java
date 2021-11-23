private static java.io.File find(java.io.File loc, java.lang.String name) {
    if (!(loc.exists()))
        return null;
    
    java.io.File find = new java.io.File(loc, name);
    if (find.exists())
        return find;
    
    for (java.io.File child : loc.listFiles()) {
        if (child.getName().startsWith(name)) {
            return child;
        }
    }
    return null;
}