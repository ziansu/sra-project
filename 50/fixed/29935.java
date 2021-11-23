public static void clearEnv(java.util.List<java.lang.String> filesToDelete) {
    if (filesToDelete != null) {
        for (java.lang.String s : filesToDelete) {
            new java.io.File(s).delete();
        }
    }
}