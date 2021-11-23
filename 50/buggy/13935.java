public void join(com.subcherry.commit.Commit joinedCommit) {
    setCommitMessage((((getCommitMessage()) + "\\n") + (joinedCommit.getCommitMessage())));
    addTouchedResources(joinedCommit.getTouchedResources());
}