@org.junit.Test
public void testCalculateScore() {
    org.cloudish.score.SimpleRankingScore score = new org.cloudish.score.SimpleRankingScore();
    org.cloudish.borg.model.Host h = new org.cloudish.borg.model.Host(0, 0.4, 0.5, null, new java.util.HashMap<>());
    org.junit.Assert.assertEquals(0.9, score.calculateScore(null, h), org.cloudish.score.TestSimpleRankingScore.ACCEPTABLE_DIFF);
}