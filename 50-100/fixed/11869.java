public double calculateIDF(java.util.List<java.lang.String[]> documents, java.lang.String wordToCheck) {
    double count = 0;
    for (java.lang.String[] ss : documents) {
        for (java.lang.String s : ss) {
            if (s.equalsIgnoreCase(wordToCheck)) {
                count++;
                break;
            }
        }
    }
    return java.lang.Math.log((((documents.size()) / 1) + count));
}