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
    return 1 + (java.lang.Math.log(((documents.size()) / count)));
}