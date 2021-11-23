@Test
void getPastReviewers() {
    java.util.Date submissionDeadline = new java.util.Date();
    java.util.Date reviewDeadline = new java.util.Date();
    Conference tester = new Conference(submissionDeadline, reviewDeadline, new ArrayList<Reviewer>());
    assertEquals(tester.getPastReviewers(), new ArrayList<Reviewer>());
}