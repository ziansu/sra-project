@org.junit.Test
public void testCalculateScore4() {
    org.cloudish.score.LeastRequestedRankingScore score = new org.cloudish.score.LeastRequestedRankingScore();
    org.cloudish.borg.model.Host h = new org.cloudish.borg.model.Host(0, 0.5, 0.5, new java.util.HashMap<>());
    h.allocate(new org.cloudish.borg.model.Task(0, 10, 0.5, 0.5, 11, true, new java.util.ArrayList<>()));
    org.junit.Assert.assertEquals(0, score.calculateScore(null, h), org.cloudish.score.TestLeastRequestedRankingScore.ACCEPTABLE_DIFF);
}