private org.json.simple.JSONArray getRecentChanges(java.util.Date date, int batchSize) throws org.wikidata.query.rdf.tool.exception.ContainedException, org.wikidata.query.rdf.tool.exception.RetryableException {
    try {
        java.lang.Thread.sleep(3000);
    } catch (java.lang.InterruptedException e) {
    }
    org.json.simple.JSONObject result = repo.fetchRecentChanges(date, batchSize);
    return ((org.json.simple.JSONArray) (((org.json.simple.JSONObject) (result.get("query"))).get("recentchanges")));
}