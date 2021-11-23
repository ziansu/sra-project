@Test
public void getReviews_retrievesALlReviewsFromDatabase_reviewsList() {
    mMovie.save();
    Review firstReview = new Review("Reviewer123", "This movie is awesome.", mMovie.getId());
    firstReview.save();
    Review secondReview = new Review("Lane21", "This movie sucks.", myMovie.getId());
    secondReview.save();
    Review[] reviews = new Review[]{ firstReview , secondReview };
    assertTrue(myMovie.getReviews().containsAll(Arrays.asList(reviews)));
}