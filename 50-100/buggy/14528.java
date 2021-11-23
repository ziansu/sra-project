private java.util.Properties setAnnotateProperties(java.lang.String model, java.lang.String language, java.lang.String lexer, java.lang.String oepc, java.lang.String dictTag, java.lang.String dictPath) {
    java.util.Properties annotateProperties = new java.util.Properties();
    annotateProperties.setProperty("model", model);
    annotateProperties.setProperty("language", language);
    annotateProperties.setProperty("ruleBasedOption", lexer);
    annotateProperties.setProperty("oepc", oepc);
    annotateProperties.setProperty("dictTag", dictTag);
    annotateProperties.setProperty("dictPath", dictPath);
    return annotateProperties;
}