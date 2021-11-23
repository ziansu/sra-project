public void writeFile(java.lang.String filePath, java.lang.String[] chargeCodes) throws java.io.IOException {
    java.io.File file = new java.io.File(filePath);
    java.io.BufferedWriter bw = null;
    try {
        bw = new java.io.BufferedWriter(new java.io.FileWriter(file, true));
        for (java.lang.String string : chargeCodes) {
            bw.append(string);
            bw.newLine();
        }
        bw.flush();
    } finally {
        com.litt.core.io.util.IOUtils.closeQuietly(bw);
    }
}