public int getNumberUniqueTerms(java.util.List<java.lang.String> WordList) {
    java.util.Set<java.lang.String> seenTerms = new java.util.HashSet<java.lang.String>();
    int count = 0;
    for (java.lang.String term : WordList) {
        if (term.equals("[OOV]"))
            continue;
        else {
            if (!(seenTerms.contains(term))) {
                seenTerms.add(term);
                count++;
            }
        }
    }
    return count;
}