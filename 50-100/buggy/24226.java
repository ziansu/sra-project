private java.util.regex.Pattern createPattern(java.lang.String textToFind) {
    java.lang.String textToFindQ = java.util.regex.Pattern.quote(textToFind);
    if (regexpChkBox.isSelected()) {
        textToFindQ = textToFind;
    }
    java.util.regex.Pattern pattern = null;
    if (caseChkBox.isSelected()) {
        pattern = java.util.regex.Pattern.compile(textToFindQ);
    }else {
        pattern = java.util.regex.Pattern.compile(textToFindQ, java.util.regex.Pattern.CASE_INSENSITIVE);
    }
    return pattern;
}