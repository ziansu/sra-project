@Test
public void getReviews_returnsAllReviewsFromOneGoal_ListReview() {
    Goal testGoal = new Goal("this is a goal", 1);
    Review testReview = new Review(testGoal.getId(), "Where's the birth certificate???");
    testGoal.save();
    testReview.save();
    assertTrue(testGoal.getReviews().get(0).equals(testReview));
}