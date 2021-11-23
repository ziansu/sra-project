@java.lang.SuppressWarnings(value = "DefaultLocale")
private static boolean checkExtension(java.lang.String path, java.lang.String[] extensions) {
    for (int i = 0; i < (extensions.length); i++) {
        if (path.toLowerCase().endsWith(extensions[i])) {
            return true;
        }
    }
    return false;
}