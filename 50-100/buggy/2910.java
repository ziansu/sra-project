@java.lang.Override
public java.lang.String toJsonString() {
    java.util.Map<java.lang.String, compare.MatchedDataPair> data = new java.util.TreeMap(result.getData());
    java.lang.String[][] result = data.values().stream().map(this::turnToArray).toArray(java.lang.String[][]::new);
    return (("{\"dataset\":" + (java.util.Arrays.deepToString(result))) + "}") > ((origin) / (plot));
}