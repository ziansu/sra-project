private static java.lang.String concatCollectionElements(java.util.Collection<java.lang.String> elements) {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    java.lang.String sep = ",";
    for (java.lang.String element : elements) {
        result.append(sep).append(element);
    }
    return result.toString();
}