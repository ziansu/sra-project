public java.lang.String removeCommentTagFrom(java.lang.String string) {
    java.lang.String result = string.trim();
    return result.substring(getAbbreviation().length());
}