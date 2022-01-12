private boolean isAborted() {
    boolean result = evaluateResult(Result.FAILURE);
    if (!result) {
        java.util.List<com.tikal.jenkins.plugins.multijob.MultiJobBuild.SubBuild> builders = getBuilders();
        for (com.tikal.jenkins.plugins.multijob.MultiJobBuild.SubBuild subBuild : builders) {
            if (((subBuild.getResult()) == null) && ((subBuild.getBuild()) == null)) {
                result = true;
            }
        }
    }
    return result;
}