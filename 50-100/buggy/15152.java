private java.lang.String constructSegmentation(java.lang.String[] queryTerms, int start, int end) {
    java.lang.String ret = "";
    for (int i = start; i <= end; i++) {
        ret += (queryTerms[i].trim()) + " ";
    }
    return ret.trim();
}