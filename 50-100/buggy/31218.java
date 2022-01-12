public java.util.Map<java.lang.String, ?> getResultMap() throws edu.umass.cs.gnscommon.exceptions.client.ClientException {
    java.lang.String responseStr = this.getRespStr();
    try {
        java.util.Map<java.lang.String, ?> map = edu.umass.cs.utils.Util.JSONObjectToMap(new org.json.JSONObject(responseStr));
        return map;
    } catch (org.json.JSONException e) {
        throw new edu.umass.cs.gnscommon.exceptions.client.ClientException(edu.umass.cs.gnscommon.ResponseCode.JSON_PARSE_ERROR, e.getMessage());
    }
}