private java.util.Queue<hu.sebcsaba.gitrelocate.CommitID> getInitialCommitSet(hu.sebcsaba.gitrelocate.GitSubGraph graph) {
    java.util.Queue<hu.sebcsaba.gitrelocate.CommitID> result = new java.util.LinkedList<hu.sebcsaba.gitrelocate.CommitID>();
    result.addAll(graph.getBranches().values());
    result.addAll(graph.getTags().values());
    return result;
}