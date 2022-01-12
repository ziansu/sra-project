@org.junit.Test
public void testCalculateScore2() {
    org.cloudish.score.LeastRequestedRankingScore score = new org.cloudish.score.LeastRequestedRankingScore();
    org.cloudish.borg.model.Host h = new org.cloudish.borg.model.Host(0, 0, 0.5, new java.util.HashMap<>());
    org.junit.Assert.assertEquals(0, score.calculateScore(null, h), org.cloudish.score.TestLeastRequestedRankingScore.ACCEPTABLE_DIFF);
}