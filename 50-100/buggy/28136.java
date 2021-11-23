private void executeCustomizer(java.lang.String[] command) throws java.lang.IllegalArgumentException, java.util.NoSuchElementException {
    java.util.ArrayList<Task> result = myTemplates.processCustomizingCommand(command);
    if (result != null) {
        java.util.ArrayList<java.lang.String> tempNames = myTemplates.getTemplateNames(result);
        window.displayTaskTable(result, null, SystemHandler.INDEX_EXECUTION_SUCCESS);
        displayProcessor.displayTemplateResult(command, tempNames, result);
    }
}