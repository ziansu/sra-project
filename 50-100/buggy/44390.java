private boolean parseLogIn(java.lang.String result) {
    boolean ret = false;
    try {
        org.json.JSONObject res = new org.json.JSONObject(result);
        if ((res.getInt("error")) == 0) {
            ret = true;
        }
    } catch (org.json.JSONException e) {
    } catch (java.io.IOException e) {
    }
    return ret;
}