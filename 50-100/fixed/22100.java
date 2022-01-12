private void explore(java.io.File file, int depth) {
    if (depth != (-1)) {
        if (file.isDirectory()) {
            java.io.File[] files = file.listFiles();
            if (files != null)
                for (java.io.File subFile : files) {
                    explore(subFile, (depth - 1));
                }
            
        }else {
            extract(file);
        }
    }
}