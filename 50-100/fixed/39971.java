private java.util.Set<java.lang.String> getJobBranchesConcernedByPost(hudson.model.AbstractProject<?, ?> job) {
    java.util.List<java.lang.String> jobBranches = new java.util.ArrayList<java.lang.String>();
    for (hudson.plugins.git.BranchSpec aSpec : ((hudson.plugins.git.GitSCM) (job.getScm())).getBranches()) {
        jobBranches.add(aSpec.getName());
    }
    java.util.Set<java.lang.String> manipulatedFilesBranches = new java.util.HashSet<java.lang.String>(getManipulatedFiles().keySet());
    manipulatedFilesBranches.retainAll(jobBranches);
    return manipulatedFilesBranches;
}