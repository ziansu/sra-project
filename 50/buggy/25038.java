public java.util.ArrayList<java.lang.String> getReviewTermsForDocument(int docId) {
    return this.getFieldTermsFromDocument(docId, Constants.REVIEW_TEXT);
}