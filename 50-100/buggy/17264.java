public static java.util.List<java.lang.String> pruneInput(java.util.List<java.lang.String> inputLines) {
    java.util.List<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String line : inputLines) {
        line.replaceAll("[^A-Za-z\\s]", "").toLowerCase();
        result.addAll(java.util.Arrays.asList(line.split("\\s")));
    }
    return result;
}