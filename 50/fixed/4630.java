private static boolean isSymlink(java.io.File file) {
    try {
        return !(file.getCanonicalFile().equals(file.getAbsoluteFile()));
    } catch (java.io.IOException e) {
        return true;
    }
}