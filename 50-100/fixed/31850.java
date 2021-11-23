public static hudson.plugins.view.dashboard.stats.StatJobs.HealthStatus getHealthStatus(hudson.model.Job job) {
    int score = job.getBuildHealth().getScore();
    int nBuilds = job.getBuilds().size();
    if (score < 20) {
        return hudson.plugins.view.dashboard.stats.StatJobs.HealthStatus.HEALTH_0_TO_19;
    }
    if (score < 40) {
        return hudson.plugins.view.dashboard.stats.StatJobs.HealthStatus.HEALTH_20_TO_39;
    }
    if (score < 60) {
        return hudson.plugins.view.dashboard.stats.StatJobs.HealthStatus.HEALTH_40_TO_59;
    }
    if (score < 80) {
        return hudson.plugins.view.dashboard.stats.StatJobs.HealthStatus.HEALTH_60_TO_79;
    }
    return nBuilds != 0 ? hudson.plugins.view.dashboard.stats.StatJobs.HealthStatus.HEALTH_OVER_80 : hudson.plugins.view.dashboard.stats.StatJobs.HealthStatus.HEALTH_UNKNOWN;
}