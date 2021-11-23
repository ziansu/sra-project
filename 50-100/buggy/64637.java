private static boolean checkExtension(java.lang.String path, java.lang.String[] extensions) {
    for (int i = 0; i < (extensions.length); i++) {
        if ((path.endsWith(extensions[i])) || (path.endsWith(extensions[i].toUpperCase()))) {
            return true;
        }
    }
    return false;
}