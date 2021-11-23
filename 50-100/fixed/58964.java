@java.lang.Override
public void process(org.json.JSONArray result) {
    try {
        user = new ca.calvinrempel.firstimpressions_pof.Profile(result.getJSONObject(0));
    } catch (org.json.JSONException f) {
        android.util.Log.d("ProcessResult", f.getLocalizedMessage());
    }
    android.widget.Toast.makeText(getBaseContext(), user.getName(), Toast.LENGTH_LONG).show();
}