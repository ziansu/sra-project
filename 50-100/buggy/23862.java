@java.lang.Override
public void process(java.lang.String o) {
    if (!(o.equals(""))) {
        try {
            saveJSon = new org.json.JSONObject(o.toString());
            saveStatus = saveJSon.getString("status");
            android.util.Log.e("Tracking", ("saved request status :" + (saveStatus)));
        } catch (org.json.JSONException e) {
            android.util.Log.e("Tracking", ("Catched JSONException. result was: " + o));
        }
    }
    success.process(o);
}