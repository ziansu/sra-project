private static java.util.Set<java.util.Map<java.lang.String, java.lang.Object>> jsonToMaps(java.lang.String json) {
    org.araqne.logdb.query.parser.JsonParser parser = new org.araqne.logdb.query.parser.JsonParser();
    org.araqne.logdb.query.command.Json sJson = ((org.araqne.logdb.query.command.Json) (parser.parse(null, json)));
    java.util.Set<java.util.Map<java.lang.String, java.lang.Object>> maps = new java.util.HashSet<java.util.Map<java.lang.String, java.lang.Object>>();
    for (org.araqne.logdb.Row row : sJson.getLogs()) {
        maps.add(row.map());
    }
    return maps;
}