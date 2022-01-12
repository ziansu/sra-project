@org.junit.Test
public void testCalculateScore3() {
    org.cloudish.score.SimpleRankingScore score = new org.cloudish.score.SimpleRankingScore();
    org.cloudish.borg.model.Host h = new org.cloudish.borg.model.Host(0, 1, 0.1, null, new java.util.HashMap<>());
    org.cloudish.borg.model.Task t = new org.cloudish.borg.model.Task(0, 10, 0.2, 0.1, 11, true, new java.util.ArrayList<>());
    h.allocate(t);
    org.junit.Assert.assertEquals(0.8, score.calculateScore(null, h), org.cloudish.score.TestSimpleRankingScore.ACCEPTABLE_DIFF);
}