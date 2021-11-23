public boolean isCommunicationOverridden() {
    boolean isOverridden = false;
    if (((commitFileContents) != null) && ((commitFileContents.size()) > 0)) {
        java.lang.String[] wordList = commitFileContents.get(0).split("\\s+");
        java.lang.String last = wordList[((wordList.length) - 1)];
        if (last.equalsIgnoreCase(org.karivar.utils.CommitMessageManipulator.JIRA_COMMUNICATION_OVERRIDDEN)) {
            isOverridden = true;
        }
    }
    return isOverridden;
}