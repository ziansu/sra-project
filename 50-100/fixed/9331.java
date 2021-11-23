@org.junit.Test
public void testCalculateScore3() {
    org.cloudish.score.KubernetesRankingScore score = new org.cloudish.score.KubernetesRankingScore();
    org.cloudish.borg.model.Host h = new org.cloudish.borg.model.Host(0, 0.5, 0.5, null, new java.util.HashMap<>());
    h.allocate(new org.cloudish.borg.model.Task(0, 10, 0.3, 0.3, 11, true, new java.util.ArrayList<>()));
    org.junit.Assert.assertEquals(14, score.calculateScore(null, h), org.cloudish.score.TestKubernetesRankingScore.ACCEPTABLE_DIFF);
}