public boolean evaluate(java.lang.String str1, java.lang.String str2) {
    org.bitmarte.architecture.utils.testingframework.selenium.dom.evaluator.impl.LOG.debug("using StartWithContentEvaluator...");
    boolean result = false;
    if (org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(str2, str1)) {
        result = true;
    }
    return result;
}