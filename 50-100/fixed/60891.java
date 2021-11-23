private boolean isAborted() {
    boolean result = evaluateResult(Result.FAILURE);
    if (!result) {
        result = true;
        java.util.List<com.tikal.jenkins.plugins.multijob.MultiJobBuild.SubBuild> builders = getBuilders();
        for (com.tikal.jenkins.plugins.multijob.MultiJobBuild.SubBuild subBuild : builders) {
            result &= ((subBuild.getResult()) == null) && ((subBuild.getBuild()) == null);
        }
    }
    return result;
}