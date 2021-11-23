public static void delete(java.io.File f) throws java.io.IOException {
    if (f.isDirectory()) {
        for (java.io.File c : f.listFiles()) {
            org.ohmage.Utilities.delete(c);
        }
    }
    if (!(f.delete())) {
        throw new java.io.IOException(("Failed to delete file: " + f));
    }
}