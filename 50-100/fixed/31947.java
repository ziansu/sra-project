@java.lang.Override
public void onSuccess(org.json.JSONObject jSONObject) throws org.json.JSONException {
    (postStatusCount)++;
    android.util.Log.d("Response", jSONObject.toString());
    if ((jSONObject.getInt("success")) == 1) {
        db.clearTable("driverStatus");
    }
    isUpdatefinished();
}