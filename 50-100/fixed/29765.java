public java.util.Map<java.lang.String, java.lang.String> phenotypesStringToMap(java.lang.String string) {
    java.util.Set<java.lang.String> ids = this.stringToSet(string);
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.TreeMap<>();
    for (java.lang.String id : ids) {
        org.phenotips.vocabulary.VocabularyTerm term = this.vocabularyManager.resolveTerm(id);
        if (term != null) {
            map.put(id, term.getName());
        }
    }
    return map;
}