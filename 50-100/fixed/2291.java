@org.junit.Test
public void testCalculateScore() {
    org.cloudish.score.KubernetesRankingScore score = new org.cloudish.score.KubernetesRankingScore();
    org.cloudish.borg.model.Host h = new org.cloudish.borg.model.Host(0, 0.5, 0.5, null, new java.util.HashMap<>());
    org.junit.Assert.assertEquals(20, score.calculateScore(null, h), org.cloudish.score.TestKubernetesRankingScore.ACCEPTABLE_DIFF);
}