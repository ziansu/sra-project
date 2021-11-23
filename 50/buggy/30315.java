private boolean isContextStartWithGivenPatterns(java.lang.String context) {
    boolean patternMatched = false;
    for (java.lang.String pattern : org.wso2.carbon.ui.valve.XSSValve.xssURIPatternList) {
        if (context.startsWith(pattern)) {
            patternMatched = true;
            break;
        }
    }
    return patternMatched;
}