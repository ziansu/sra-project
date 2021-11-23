public static java.util.List<java.lang.String> group(java.lang.String value) {
    java.util.Set<java.lang.Integer> startIndexes = org.hcjf.utils.Strings.allIndexOf(value, org.hcjf.utils.Strings.START_GROUP);
    java.util.Set<java.lang.Integer> endIndexes = org.hcjf.utils.Strings.allIndexOf(value, org.hcjf.utils.Strings.END_GROUP);
    if ((startIndexes.size()) != (endIndexes.size())) {
        throw new java.lang.IllegalArgumentException("");
    }
    return org.hcjf.utils.Strings.group(value, startIndexes, endIndexes);
}