public static void putFloatArray(android.content.SharedPreferences.Editor editor, java.lang.String key, float[] array) {
    try {
        org.json.JSONArray json = new org.json.JSONArray();
        for (float f : array) {
            json.put(f);
        }
        editor.putString(key, json.toString());
    } catch (org.json.JSONException e) {
        android.util.Log.e(org.tomahawk.libtomahawk.utils.VariousUtils.TAG, ((("putFloatArray: " + (e.getClass())) + ": ") + (e.getLocalizedMessage())));
    }
}