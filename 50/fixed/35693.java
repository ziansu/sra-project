private static boolean numberNotInExclutionList(java.lang.String oldNotation) {
    java.util.List<java.lang.String> exclutions = java.util.Arrays.asList("2014");
    return !(exclutions.contains(oldNotation));
}