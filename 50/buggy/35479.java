final void updateOKStatus() {
    boolean regexStatus = validateRegex();
    boolean hasFilePattern = (fExtensions.getText().length()) > 0;
    getContainer().setPerformActionEnabled((regexStatus && hasFilePattern));
}