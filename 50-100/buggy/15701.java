@java.lang.Override
public void parseJSONData(org.json.JSONObject o) {
    super.parseJSONData(o);
    friends_list = new java.util.ArrayList<java.lang.String>();
    try {
        for (int i = 0; i < (o.getJSONArray("data").length()); i++) {
            friends_list.add(o.getJSONArray("data").getJSONObject(i).toString());
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}