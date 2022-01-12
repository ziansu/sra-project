public java.lang.String ConvertByWords(java.lang.String searchString) {
    java.lang.String result = searchString;
    if (!(searchString.contains("מתכון"))) {
        result = java.lang.String.format("%s %s", "מתכון", searchString);
    }
    return result;
}