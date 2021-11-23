private void listAllFiles2(java.lang.String path) {
    java.io.File[] files = new java.io.File(path).listFiles();
    this.urls2 = new java.util.ArrayList();
    if (files != null) {
        for (java.io.File f : files) {
            this.urls2.add(f);
        }
    }
}