private java.util.List<java.lang.String> retrieveHashTags() {
    org.json.JSONArray hashTagsJsonArray = getJSONArray(com.worldspotlightapp.android.model.Video.PARSE_COLUMN_HASH_TAGS);
    java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.ArrayList<java.lang.String>>() {    }.getType();
    java.util.List<java.lang.String> hashTagsList = gson.fromJson(hashTagsJsonArray.toString(), type);
    android.util.Log.v(com.worldspotlightapp.android.model.Video.TAG, ((("The origina list of hash tags is " + hashTagsJsonArray) + ", and the converted is ") + hashTagsList));
    return hashTagsList;
}