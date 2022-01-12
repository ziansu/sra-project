private java.lang.String getPropertyName(java.lang.String nodeName) {
    nodeName = ruleFactory.getNameHelper().replaceIllegalCharacters(nodeName);
    nodeName = ruleFactory.getNameHelper().normalizeName(nodeName, false);
    if (javax.lang.model.SourceVersion.isKeyword(nodeName)) {
        nodeName = "_" + nodeName;
    }
    if (javax.lang.model.SourceVersion.isKeyword(nodeName)) {
        nodeName += "_";
    }
    return nodeName;
}