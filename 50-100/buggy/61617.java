private void generateClassForObject(org.json.JSONObject json, java.lang.String key, com.nvinayshetty.DTOnator.FieldCreator.FieldRepresentor fieldRepresentor) throws org.json.JSONException {
    switch (fieldRepresentor) {
        case JSON_OBJECT :
            {
                org.json.JSONObject jsonObject = json.getJSONObject(key);
                addClass(key, jsonObject);
            }
            break;
        case JSON_ARRAY :
            org.json.JSONObject jsonArrayObject = ((org.json.JSONObject) (json.getJSONArray(key).get(0)));
            addClass(key, jsonArrayObject);
            break;
    }
}