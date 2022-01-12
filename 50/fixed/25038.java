public java.util.ArrayList<java.lang.String> getReviewTermsForDocument(int docId) {
    return getFieldTermsFromDocument(docId, Constants.REVIEW_TEXT);
}