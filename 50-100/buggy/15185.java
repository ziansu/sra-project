private static java.lang.String printBiwordResults(BiwordIndex biword, java.util.List<java.lang.String> fileNames) {
    java.lang.String printed = "";
    java.lang.String[] mDictionary = biword.getDictionary();
    for (java.lang.String s : mDictionary) {
        printed += s + ":\n";
        for (java.lang.Integer i : biword.getPostings(s)) {
            printed += ("\t\t\t" + (fileNames.get(i))) + "\n";
        }
    }
    return printed;
}