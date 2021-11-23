@org.junit.Test
public void validate_shouldReturnMaxScoreIfEverythingIsCorrect() {
    int score = validator.validate(answer1);
    org.junit.Assert.assertTrue(((("Validate should return maxScore if everything is correct. It was " + score) + " but expected is: ") + (quest1.getMaxScore())), (score == (quest1.getMaxScore())));
}