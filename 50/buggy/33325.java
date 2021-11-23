private boolean isPreviousBuildSuccess(org.jenkinsci.plugins.azureeventgridnotifier.AbstractBuild build) {
    if (((build.getResult()) == (Result.SUCCESS)) && ((findPreviousBuildResult(build)) == (Result.SUCCESS))) {
        return true;
    }
    return false;
}