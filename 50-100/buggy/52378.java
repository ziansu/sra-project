@Test
void getPastReviewers() {
    java.util.Date submissionDeadline = java.util.Calendar.getInstance().getTime();
    java.util.Date reviewDeadline = java.util.Calendar.getInstance().getTime();
    Conference tester = new Conference(submissionDeadline, reviewDeadline, new ArrayList<Reviewer>());
    assertEquals(tester.getPastReviewers(), new ArrayList<Reviewer>());
}