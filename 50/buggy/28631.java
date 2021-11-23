private java.util.regex.Pattern resolveRestrictedCompiledPattern() {
    if ((restrictedCompiledPattern) == null) {
        if (org.apache.commons.lang.StringUtils.isEmpty(restrictedPattern)) {
            restrictedPattern = org.divy.sonar.check.java.generic.GenericStringLiteralCheck.HTML_PATTERN;
        }
        restrictedCompiledPattern = java.util.regex.Pattern.compile(restrictedPattern);
    }
    return restrictedCompiledPattern;
}