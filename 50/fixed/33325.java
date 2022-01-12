private boolean isPreviousBuildSuccess(org.jenkinsci.plugins.azureeventgridnotifier.AbstractBuild build) {
    return ((build.getResult()) == (Result.SUCCESS)) && ((findPreviousBuildResult(build)) == (Result.SUCCESS));
}