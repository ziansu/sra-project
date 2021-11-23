@java.lang.Override
public void onSuccess(org.json.JSONObject jSONObject) throws org.json.JSONException {
    android.util.Log.d("Response", jSONObject.toString());
    (postlogCount)++;
    if ((jSONObject.getInt("success")) == 1) {
        db.clearTable("conceptBookingLog");
        db.clearTable("adhocBookingLog");
    }
    isUpdatefinished();
}