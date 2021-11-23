public boolean contentChecker(java.lang.String currentInput) {
    boolean hasContent = false;
    if (currentInput.contains(content)) {
        hasContent = true;
    }
    return hasContent;
}