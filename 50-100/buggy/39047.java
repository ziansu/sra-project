public java.util.List<?> getResultList() throws edu.umass.cs.gnscommon.exceptions.client.ClientException {
    java.lang.String responseStr = this.getRespStr();
    try {
        java.util.List<?> list = edu.umass.cs.utils.Util.JSONArrayToList(new org.json.JSONArray(responseStr));
        return list;
    } catch (org.json.JSONException e) {
        throw new edu.umass.cs.gnscommon.exceptions.client.ClientException(edu.umass.cs.gnscommon.ResponseCode.JSON_PARSE_ERROR, e.getMessage());
    }
}