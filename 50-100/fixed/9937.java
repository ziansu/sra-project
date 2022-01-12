private static java.lang.String getVocab() {
    java.lang.String[] dictionary = GuiMain.index.getDictionary();
    int count = GuiMain.index.getTermCount();
    java.lang.StringBuffer vocab = new java.lang.StringBuffer("Index Dictionary: \n");
    for (java.lang.String s : dictionary) {
        vocab.append((s + "\n"));
    }
    vocab.append(("Index Term Count: " + count));
    return vocab.toString();
}