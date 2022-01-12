private java.lang.String getClassName(java.lang.String nodeName, com.sun.codemodel.JPackage _package) {
    java.lang.String className = ruleFactory.getNameHelper().replaceIllegalCharacters(capitalize(nodeName));
    java.lang.String normalizedName = ruleFactory.getNameHelper().normalizeName(className);
    return makeUnique(normalizedName, _package);
}