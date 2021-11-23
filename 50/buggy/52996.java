private java.lang.String getEnumName(java.lang.String nodeName) {
    java.lang.String className = ruleFactory.getNameHelper().replaceIllegalCharacters(capitalize(nodeName));
    return ruleFactory.getNameHelper().normalizeName(className);
}