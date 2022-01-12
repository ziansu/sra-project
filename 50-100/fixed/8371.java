private void putTagsInJSONObj(org.json.simple.JSONObject object, java.lang.String[] tags) {
    if (tags != null) {
        java.util.List<java.lang.String> tagList = new java.util.ArrayList<java.lang.String>();
        for (java.lang.String string : tags) {
            tagList.add(string);
        }
        object.put("tags", tagList);
    }else {
        object.put("tags", null);
    }
}