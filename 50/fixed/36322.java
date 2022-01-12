int getCountInCategory(java.lang.String term, java.lang.String category) {
    if (termCountsInCategory.get(category).containsKey(term)) {
        return 1 + (termCountsInCategory.get(category).get(term));
    }
    return 1;
}