public static void clearExtensionals() {
    conceptualhierarchy.ActualData.extensionals = new java.util.HashMap();
    for (java.lang.String predicate : conceptualhierarchy.ActualData.predicateExtensionals.keySet()) {
        conceptualhierarchy.ActualData.predicateExtensionals.get(predicate).clear();
    }
}