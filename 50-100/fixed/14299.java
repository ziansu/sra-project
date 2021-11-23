private void printCommitErrors(com.atlassian.stash.hook.HookResponse hookResponse, com.atlassian.stash.content.Changeset commit, com.surevine.sanitsation.SanitisationResult result) {
    hookResponse.out().println(java.lang.String.format("Commit %s (%s) failed sanitisation check:", commit.getDisplayId(), commit.getAuthor().getName()));
    for (java.lang.String error : result.getErrors()) {
        hookResponse.out().println(error.trim());
    }
}