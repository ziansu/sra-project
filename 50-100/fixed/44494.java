@org.junit.Test
public void testDeleteVoteReturnsRightUrlForNullPlusValidInput() {
    java.lang.String movieIdNotValid = null;
    java.lang.String userIdNotValid = null;
    resultUrl = crudController.deleteVote(movieId, userIdNotValid);
    org.junit.Assert.assertTrue("redirect:/voteList".equals(resultUrl));
    resultUrl = crudController.deleteVote(movieIdNotValid, userId);
    org.junit.Assert.assertTrue("redirect:/voteList".equals(resultUrl));
}