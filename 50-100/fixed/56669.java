@org.junit.Test
public void testCalculateScore2() {
    org.cloudish.score.BalancedResourceAllocationRankingScore score = new org.cloudish.score.BalancedResourceAllocationRankingScore();
    org.cloudish.borg.model.Host h = new org.cloudish.borg.model.Host(0, 0.5, 0.5, null, new java.util.HashMap<>());
    h.allocate(new org.cloudish.borg.model.Task(0, 10, 0.5, 0, 11, true, new java.util.ArrayList<>()));
    org.junit.Assert.assertEquals(0, score.calculateScore(null, h), org.cloudish.score.TestBalancedResourceAllocationRankingScore.ACCEPTABLE_DIFF);
}