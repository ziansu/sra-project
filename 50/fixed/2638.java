public boolean isAtPaperLimit() {
    return (numberOfReviews) > (model.Reviewer.REVIEW_LIMIT);
}