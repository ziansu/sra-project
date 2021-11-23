public static teamcool.tradego.User fromJSON(org.json.JSONObject object) {
    teamcool.tradego.User user = null;
    try {
        user = new teamcool.tradego.User(object.getString("name"), object.getString("id"), object.getJSONObject("location").getString("name"), object.getString("timezone"), new java.util.ArrayList<teamcool.tradego.Item>(), new java.util.ArrayList<teamcool.tradego.User>());
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return user;
}