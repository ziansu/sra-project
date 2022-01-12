public org.json.JSONObject getResultJSONObject() throws edu.umass.cs.gnscommon.exceptions.client.ClientException {
    java.lang.String responseStr = this.getRespStr();
    try {
        org.json.JSONObject json = new org.json.JSONObject(responseStr);
        return json;
    } catch (org.json.JSONException e) {
        throw new edu.umass.cs.gnscommon.exceptions.client.ClientException(edu.umass.cs.gnscommon.ResponseCode.JSON_PARSE_ERROR, (((e.getMessage()) + " while parsing response string ") + responseStr));
    }
}