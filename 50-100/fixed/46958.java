private java.util.Set<hu.sebcsaba.gitrelocate.CommitID> getInitialCommitSet(hu.sebcsaba.gitrelocate.GitSubGraph graph) {
    java.util.Set<hu.sebcsaba.gitrelocate.CommitID> result = new java.util.HashSet<hu.sebcsaba.gitrelocate.CommitID>();
    result.addAll(graph.getBranches().values());
    result.addAll(graph.getTags().values());
    return result;
}