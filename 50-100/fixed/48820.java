private org.junit.runner.Description advanceToNextTestDescription(java.lang.String message) {
    (testIndex)++;
    java.util.ArrayList<org.junit.runner.Description> children = parentDescription.getChildren();
    while ((testIndex) < (children.size())) {
        org.junit.runner.Description description = children.get(testIndex);
        if (description.isTest())
            return description;
        else
            (testIndex)++;
        
    } 
    throw new java.lang.IllegalStateException(java.lang.String.format("Could not find Description for test '%s'", message));
}