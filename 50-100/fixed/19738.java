@java.lang.Override
public void onSuccess(org.json.JSONObject jSONObject) throws org.json.JSONException {
    (postImagesCount)++;
    android.util.Log.d("Response", jSONObject.toString());
    if ((jSONObject.getInt("success")) == 1) {
        java.io.File file = new java.io.File(FILE_PATH, name);
        file.delete();
    }
    isUpdatefinished();
}