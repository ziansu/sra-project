public void serialize(java.lang.String outputFile) {
    try {
        java.io.FileOutputStream fileOut = new java.io.FileOutputStream(outputFile);
        java.io.ObjectOutputStream objOut = new java.io.ObjectOutputStream(fileOut);
        objOut.writeObject(trie);
        objOut.close();
        fileOut.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}