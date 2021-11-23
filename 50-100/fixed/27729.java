private org.scenarioo.model.docu.aggregates.branches.BranchBuilds findBranch(final java.lang.String branchName) {
    for (org.scenarioo.model.docu.aggregates.branches.BranchBuilds branchBuilds : this.branchBuildsList) {
        if ((!(branchBuilds.isAlias())) && (branchBuilds.getBranch().getName().equals(branchName))) {
            return branchBuilds;
        }
    }
    return null;
}