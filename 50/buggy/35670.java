private boolean parseExactClearCommand(java.util.Map<java.lang.String, java.lang.String[]> parsedResult) {
    java.lang.System.out.println(java.util.Arrays.toString(parsedResult.get("default")));
    return (parsedResult.get("default")[1]) == null;
}