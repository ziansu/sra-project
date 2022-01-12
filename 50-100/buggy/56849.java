public void parseDocuments(java.io.File rootDir) {
    java.io.File[] dirs = rootDir.listFiles();
    for (java.io.File dir : dirs) {
        if (dir.isDirectory()) {
            for (java.io.File file : dir.listFiles()) {
                if (dir.isFile()) {
                    thPool.execute(new searcher.parser.DocumentParser(tflowerBound, tfupperBound, index, stemmer, stopWordList, file));
                }
            }
        }
    }
}