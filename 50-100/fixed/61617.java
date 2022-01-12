private void generateClassForObject(org.json.JSONObject json, java.lang.String key, com.nvinayshetty.DTOnator.FieldCreator.FieldRepresentor fieldRepresentor) throws org.json.JSONException {
    switch (fieldRepresentor) {
        case JSON_OBJECT :
            {
                org.json.JSONObject jsonObject = json.getJSONObject(key);
                addClass(key, jsonObject);
            }
            break;
        case JSON_ARRAY :
            java.lang.Object jsonArrayObject = json.getJSONArray(key).get(0);
            if (jsonArrayObject instanceof org.json.JSONObject)
                addClass(key, ((org.json.JSONObject) (jsonArrayObject)));
            
            break;
    }
}