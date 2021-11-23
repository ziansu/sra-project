@org.junit.Test
public void testFailureRate() {
    java.util.ArrayList<hudson.plugins.global_build_stats.model.JobBuildSearchResult> jbsr = new java.util.ArrayList<hudson.plugins.global_build_stats.model.JobBuildSearchResult>();
    jbsr.add(createJobResult("build job 1", true));
    jbsr.add(createJobResult("build job 1", false));
    jenkins.plugins.build_metrics.stats.StatsFactory sf = jenkins.plugins.build_metrics.stats.StatsFactory.generateStats(jbsr);
    assertEquals("StatsFactory.failureRate", 50.0, sf.getFailureRate());
    for (jenkins.plugins.build_metrics.stats.StatsModel stat : sf.getStats()) {
        assertEquals("StatsModel.failureRate", 50.0, stat.getFailureRate());
    }
}