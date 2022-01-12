private void listAllFiles2(java.lang.String path) {
    java.io.File[] files = new java.io.File(path).listFiles();
    if (files != null) {
        for (java.io.File f : files) {
            this.urls2.add(f);
        }
    }
}