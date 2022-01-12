private java.lang.String renameReplaceAll(java.lang.String replacementString, java.lang.String tagName, java.lang.String movieContentOfTag) {
    java.lang.String replacedString = replacementString;
    if (movieContentOfTag == null) {
        replacedString = replacedString.replace(tagName, "");
    }
    if (replacedString.contains(tagName)) {
        replacedString = org.apache.commons.lang3.StringUtils.replace(replacedString, tagName, movieContentOfTag);
    }
    if ((movieContentOfTag == null) || (movieContentOfTag.trim().equals(""))) {
        replacedString = replacedString.replaceAll("\\[\\]|\\(\\)", "");
    }
    return replacedString;
}