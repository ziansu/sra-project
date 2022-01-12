private boolean checkForUniquenessConstraints(java.util.Set<java.lang.String> columnNames, java.lang.String tableConstraints, java.util.regex.Pattern regex) {
    if (tableConstraints == null) {
        return false;
    }
    java.util.regex.Matcher matcher = regex.matcher(tableConstraints);
    while (matcher.find()) {
        java.util.Set<java.lang.String> namesInExpressions = extractNamesFromExpressions(matcher.group(1));
        if (columnNames.equals(namesInExpressions)) {
            return true;
        }
    } 
    return false;
}