private static void removeFiles(java.lang.String path) {
    java.io.File file = new java.io.File(path);
    if (file.exists()) {
        java.lang.String deleteCmd = "rm -r " + path;
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        try {
            runtime.exec(deleteCmd);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}