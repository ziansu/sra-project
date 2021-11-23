private void writeFile(java.io.BufferedWriter fw, java.util.List<java.lang.String> corpus) throws java.io.IOException {
    for (java.lang.String str : corpus) {
        fw.write((str + "\n\n"));
    }
    fw.write("\n");
    fw.flush();
}