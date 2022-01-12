public static org.json.JSONObject getSqlQueries() {
    java.io.File queries = new java.io.File(db.shared.utils.CommonUtils.getResourceFile("queries.json"));
    org.json.JSONObject jsonObject = null;
    try {
        java.lang.String jsonTxt = db.framework.utils.Utils.readTextFile(queries);
        jsonObject = new org.json.JSONObject(jsonTxt);
    } catch (java.io.IOException | org.json.JSONException e) {
        e.printStackTrace();
    }
    return jsonObject;
}