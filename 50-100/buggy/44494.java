@org.junit.Test
public void testDeleteVoteReturnsRightUrlForNullPlusValidInput() {
    java.lang.String movieIdNotValid = null;
    java.lang.String userIdNotValid = null;
    resultUrl = crudController.deleteVote(movieId, userIdNotValid);
    org.junit.Assert.assertTrue(resultUrl.equals("redirect:/voteList"));
    resultUrl = crudController.deleteVote(movieIdNotValid, userId);
    org.junit.Assert.assertTrue("redirect:/voteList".equals(resultUrl));
}