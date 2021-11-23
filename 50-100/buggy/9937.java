private static java.lang.String getVocab() {
    java.lang.String[] dictionary = GuiMain.index.getDictionary();
    int count = GuiMain.index.getTermCount();
    java.lang.String vocab = "Index Dictionary: \n";
    for (java.lang.String s : dictionary) {
        vocab += s + "\n";
    }
    vocab += "Index Term Count: " + count;
    return vocab;
}