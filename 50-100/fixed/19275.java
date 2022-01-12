private java.lang.String extractAtomicSubject(java.util.List<java.lang.String> tokensList, java.util.List<java.lang.String> tagsList, int extractionEndIndex) {
    for (int i = extractionEndIndex; i >= 0; i--) {
        if ((i != extractionEndIndex) && ((Tags.NOUN.equals(tagsList.get(i))) || (Tags.VERB_ED.equals(tagsList.get(i))))) {
            return tokensList.get(i);
        }
    }
    throw new java.lang.IllegalStateException("There is no subject in the sentence");
}