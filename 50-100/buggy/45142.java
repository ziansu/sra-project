public com.creativewidgetworks.goldparser.parser.GOLDParser parser(java.io.File grammarFile) {
    com.creativewidgetworks.goldparser.parser.GOLDParser parser = new com.creativewidgetworks.goldparser.parser.GOLDParser(grammarFile, "com.brweber2.parser.rulehandler", false);
    java.util.List<java.lang.String> errors = parser.validateHandlersExist();
    if (!(errors.isEmpty())) {
        throw new java.lang.RuntimeException(("Missing handlers!" + errors));
    }
    return parser;
}