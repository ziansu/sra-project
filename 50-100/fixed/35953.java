@Test
public void getReviews_retrievesALlReviewsFromDatabase_reviewsList() {
    mMovie.save();
    Review firstReview = new Review("Reviewer123", "This movie is awesome.", mMovie.getId());
    firstReview.save();
    Review secondReview = new Review("Lane21", "This movie sucks.", mMovie.getId());
    secondReview.save();
    Review[] reviews = new Review[]{ firstReview , secondReview };
    assertTrue(mMovie.getReviews().containsAll(java.util.Arrays.asList(reviews)));
}