public java.util.List<org.nibor.git_merge_repos.MergedRef> run() throws java.io.IOException, org.eclipse.jgit.api.errors.GitAPIException {
    fetch();
    java.util.List<org.nibor.git_merge_repos.MergedRef> mergedBranches = mergeBranches();
    java.util.List<org.nibor.git_merge_repos.MergedRef> mergedTags = mergeTags();
    java.util.List<org.nibor.git_merge_repos.MergedRef> mergedRefs = new java.util.ArrayList<>();
    mergedRefs.addAll(mergedBranches);
    mergedRefs.addAll(mergedTags);
    deleteOriginalRefs();
    resetToBranch();
    return mergedRefs;
}