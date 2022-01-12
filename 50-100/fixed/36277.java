private org.json.JSONObject makeJsonObject(java.lang.String response) {
    if ((response != null) && ((response.length()) > 0)) {
        java.lang.String pureJson = response.substring(14, ((response.length()) - 1));
        try {
            return new org.json.JSONObject(pureJson);
        } catch (org.json.JSONException e) {
            logHelper.error(Constants.LOGTAG, ("!Error when parsing json: " + pureJson));
        }
    }
    return null;
}