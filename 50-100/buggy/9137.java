public void generateExtensionalDB(java.lang.String path) throws java.lang.Exception {
    int i = 1;
    java.lang.StringBuilder buf = new java.lang.StringBuilder();
    for (java.io.File file : files) {
        buf.append(factsFromFiles(file, (i++)));
    }
    java.io.PrintWriter prologWriter = new java.io.PrintWriter(new java.io.FileWriter((path + "edb.pl")), true);
    prologWriter.println(buf);
    prologWriter.flush();
    prologWriter.close();
}