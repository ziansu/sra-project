public void deserialize(java.lang.String trieFile) {
    try {
        java.io.FileInputStream fileIn = new java.io.FileInputStream(trieFile);
        java.io.ObjectInputStream objIn = new java.io.ObjectInputStream(fileIn);
        trie = ((Trie) (objIn.readObject()));
        objIn.close();
        fileIn.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
}