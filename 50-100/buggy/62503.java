@java.lang.Override
public void call(java.lang.Object... args) {
    org.json.JSONObject data = ((org.json.JSONObject) (args[0]));
    try {
        Assets.id = data.getInt("id");
        Assets.msg = data.getString("msg");
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}