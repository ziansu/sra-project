public java.lang.String getLogFileBaseName(long startOffset, long endOffset) {
    java.util.ArrayList<java.lang.String> basenameElements = new java.util.ArrayList<java.lang.String>();
    basenameElements.add(java.lang.Long.toString(startOffset));
    basenameElements.add(java.lang.Long.toString(endOffset));
    return org.apache.commons.lang.StringUtils.join(basenameElements, "_");
}