public static int numberOfLinesInFile(java.lang.String file) throws java.io.IOException {
    int countRec = 0;
    long lastRec;
    try (java.io.RandomAccessFile randFile = new java.io.RandomAccessFile(file, "r")) {
        lastRec = randFile.length();
    }
    java.io.LineNumberReader lineRead;
    try (java.io.FileReader fileRead = new java.io.FileReader(file)) {
        lineRead = new java.io.LineNumberReader(fileRead);
        lineRead.skip(lastRec);
        countRec = lineRead.getLineNumber();
    }
    lineRead.close();
    return countRec;
}