@org.junit.Test
public void testCalculateScore5() {
    org.cloudish.score.LeastRequestedRankingScore score = new org.cloudish.score.LeastRequestedRankingScore();
    org.cloudish.borg.model.Host h = new org.cloudish.borg.model.Host(0, 0.5, 0.5, null, new java.util.HashMap<>());
    h.allocate(new org.cloudish.borg.model.Task(0, 10, 0.1, 0.5, 11, true, new java.util.ArrayList<>()));
    org.junit.Assert.assertEquals(4, score.calculateScore(null, h), org.cloudish.score.TestLeastRequestedRankingScore.ACCEPTABLE_DIFF);
}