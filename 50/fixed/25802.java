@java.lang.Override
public java.lang.String parse(java.lang.String sourceCode) {
    java.lang.String temp = org.apache.commons.lang.StringUtils.trimToEmpty(sourceCode);
    temp = preProcess(temp);
    return postProcess(temp);
}