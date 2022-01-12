private java.lang.String readSourceCode(org.codehaus.groovy.control.SourceUnit sourceUnit) {
    java.lang.String text = null;
    try {
        text = org.codehaus.groovy.runtime.IOGroovyMethods.getText(sourceUnit.getSource().getReader());
    } catch (java.io.IOException e) {
        org.apache.groovy.parser.antlr4.AstBuilder.LOGGER.severe(createExceptionMessage(e));
        throw new java.lang.RuntimeException("Error occurred when reading source code.", e);
    }
    return text;
}