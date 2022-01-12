public static java.lang.String getCurrentBranch(@org.jetbrains.annotations.NotNull
final com.intellij.openapi.project.Project project) {
    git4idea.repo.GitRepository repository = null;
    git4idea.GitLocalBranch localBranch = null;
    java.lang.String branchName = "";
    try {
        repository = git4idea.branch.GitBranchUtil.getCurrentRepository(project);
        localBranch = repository.getCurrentBranch();
        branchName = localBranch.getName();
    } catch (java.lang.NullPointerException e) {
        e.getMessage();
    }
    return branchName;
}