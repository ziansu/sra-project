private void executeCustomizer(java.lang.String[] command) throws java.lang.IllegalArgumentException, java.util.NoSuchElementException {
    java.util.ArrayList<Task> result = myTemplates.processCustomizingCommand(command);
    if (result != null) {
        java.util.ArrayList<java.lang.String> tempNames = myTemplates.getTemplateNames(result);
        displayProcessor.displayTemplateResult(command, tempNames, result);
    }
}