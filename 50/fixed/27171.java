private java.lang.String createSummaryButtonString(java.lang.String summaryType, int numItems) {
    java.lang.String summaryString = ((summaryType + "\n") + (java.lang.Integer.toString(numItems))) + " Item(s)";
    return summaryString;
}