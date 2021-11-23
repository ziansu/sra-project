private void cleanOutput(java.lang.String folder) throws java.io.IOException {
    for (java.io.File f : new java.io.File(folder).listFiles()) {
        if (!(isValidFile(f.getAbsolutePath()))) {
            if (!(f.isDirectory())) {
                f.delete();
            }
        }
    }
}