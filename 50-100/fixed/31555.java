@java.lang.Override
public void onSuccess(org.json.JSONObject jSONObject) throws org.json.JSONException {
    (postjobsCount)++;
    android.util.Log.d("Response", jSONObject.toString());
    if ((jSONObject.getInt("success")) == 1) {
        if ((jSONObject.getInt("status")) == 10) {
            db.clearConcept(id, concept);
        }
    }
    isUpdatefinished();
}