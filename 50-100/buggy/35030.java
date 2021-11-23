public static com.reddit.material.UnloadedComments generateUnloadedComments(org.json.JSONObject object) {
    try {
        com.reddit.material.UnloadedComments comments;
        comments = new com.reddit.material.UnloadedComments(object.getString("name"), object.getInt("count"), object.getString("parent_id"), object.getJSONArray("children"));
        android.util.Log.i(com.reddit.material.Util.TAG, ("generateUnloadedComments: " + (object.toString())));
        return comments;
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}