private static org.json.JSONObject parseStandardCondition(fr.unice.polytech.ecoknowledge.language.api.implem.Condition c) {
    org.json.JSONObject condition = new org.json.JSONObject();
    condition.put("type", "standard");
    condition.put("expression", fr.unice.polytech.ecoknowledge.language.api.implem.JSONBuilder.parseExpression(c));
    condition.put("targetTime", fr.unice.polytech.ecoknowledge.language.api.implem.JSONBuilder.parseTargetTime(c.getWfv()));
    condition.put("counter", fr.unice.polytech.ecoknowledge.language.api.implem.JSONBuilder.parseAtLeast(c.getWfv()));
    return condition;
}