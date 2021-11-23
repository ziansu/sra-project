public data.Subject findSingleSubjectByTitle(java.lang.String title) {
    java.util.List<data.Subject> results = findSubjectByTitle(title);
    if (!(results.isEmpty())) {
        return results.get(0);
    }
    return null;
}