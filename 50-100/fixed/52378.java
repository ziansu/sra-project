@Test
void getPastReviewers() {
    java.util.Date submissionDeadline = java.util.Calendar.getInstance().getTime();
    java.util.Date reviewDeadline = java.util.Calendar.getInstance().getTime();
    Conference tester = new Conference(submissionDeadline, reviewDeadline, new java.util.ArrayList<Reviewer>());
    assertEquals(tester.getPastReviewers(), new java.util.ArrayList<Reviewer>());
}