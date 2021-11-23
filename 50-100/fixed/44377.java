public boolean isCommitOverridden() {
    boolean isCommitOverridden = false;
    if (((commitFileContents) != null) && ((commitFileContents.size()) > 0)) {
        java.lang.String[] wordList = commitFileContents.get(0).split("\\s+");
        if ((wordList.length) > 0) {
            java.lang.String first = wordList[0];
            if (first.equalsIgnoreCase(org.karivar.utils.CommitMessageManipulator.JIRA_COMMIT_OVERRIDDEN)) {
                isCommitOverridden = true;
            }
        }
    }
    return isCommitOverridden;
}