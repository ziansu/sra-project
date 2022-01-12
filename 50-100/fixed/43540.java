private int countFiles(java.io.File f) {
    if (f.isDirectory()) {
        int c = 0;
        if ((f.listFiles()) == null) {
            return 0;
        }
        for (java.io.File child : f.listFiles()) {
            c += countFiles(child);
        }
        return c;
    }else {
        return 1;
    }
}