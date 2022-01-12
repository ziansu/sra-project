@java.lang.SuppressWarnings(value = "unchecked")
private void setScoresFromJSON(edu.uncc.cs.watsonsim.Passage p, java.lang.String json) {
    org.json.simple.JSONObject jo = ((org.json.simple.JSONObject) (org.json.simple.JSONValue.parse(json)));
    for (java.lang.Object o : jo.entrySet()) {
        java.util.Map.Entry<java.lang.String, java.lang.Double> entry = ((java.util.Map.Entry<java.lang.String, java.lang.Double>) (o));
        edu.uncc.cs.watsonsim.Score.set(p.scores, entry.getKey(), entry.getValue());
    }
}