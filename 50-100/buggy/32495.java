public static org.json.simple.JSONObject toJSON(jo.alexa.sim.data.MatchBean match) {
    if (match == null)
        return null;
    
    org.json.simple.JSONObject jmatch = new org.json.simple.JSONObject();
    jmatch.put("Confidence", match.getConfidence());
    jmatch.put("Intent", match.getIntent().getIntent());
    jmatch.put("Values", jo.alexa.sim.ui.logic.ToJSONLogic.toJSON(match.getValues()));
    return jmatch;
}