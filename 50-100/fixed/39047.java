public java.util.List<?> getResultList() throws edu.umass.cs.gnscommon.exceptions.client.ClientException {
    java.lang.String responseStr = this.getRespStr();
    try {
        java.util.List<?> list = edu.umass.cs.utils.Util.JSONArrayToList((responseStr != null ? new org.json.JSONArray(responseStr) : new org.json.JSONArray()));
        return list;
    } catch (org.json.JSONException e) {
        throw new edu.umass.cs.gnscommon.exceptions.client.ClientException(edu.umass.cs.gnscommon.ResponseCode.JSON_PARSE_ERROR, e.getMessage());
    }
}