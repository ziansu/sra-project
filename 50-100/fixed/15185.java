private static java.lang.String printBiwordResults(BiwordIndex biword, java.util.List<java.lang.String> fileNames) {
    java.lang.StringBuffer printed = new java.lang.StringBuffer();
    java.lang.String[] mDictionary = biword.getDictionary();
    for (java.lang.String s : mDictionary) {
        printed.append((s + ":\n"));
        for (java.lang.Integer i : biword.getPostings(s)) {
            printed.append((("\t\t\t" + (fileNames.get(i))) + "\n"));
        }
    }
    return printed.toString();
}