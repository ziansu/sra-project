private void doTask2(java.io.File dir) {
    for (java.io.File f : dir.listFiles()) {
        if (f.isFile()) {
            doBuildHtml(f);
            continue;
        }
        if (f.isDirectory()) {
            doTask2(f);
        }
    }
}