public java.lang.String getReviewerId() {
    if ((reviewerId) == null) {
        return getReport().getReviewerId().toString();
    }
    return reviewerId;
}