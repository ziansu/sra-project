public void findMatchingElements(java.lang.String query, com.facebook.stetho.common.Accumulator<java.lang.Integer> matchedIds) {
    verifyThreadAccess();
    final java.util.regex.Pattern queryPattern = java.util.regex.Pattern.compile(java.util.regex.Pattern.quote(query), java.util.regex.Pattern.CASE_INSENSITIVE);
    final java.lang.Object rootElement = mDocumentProvider.getRootElement();
    findMatches(queryPattern, rootElement, matchedIds);
}