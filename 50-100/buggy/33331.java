public static void assertJsonArrayEqualsForSpecifiedField(com.alibaba.fastjson.JSONArray exptectedJson, com.alibaba.fastjson.JSONArray actualJson, java.lang.String key) {
    org.junit.Assert.assertEquals("Verify two Json Array length is equal.", exptectedJson.size(), actualJson.size());
    for (int i = 0, size = exptectedJson.size(); i < size; i++) {
        com.alibaba.fastjson.JSONObject expectedJsonObj = exptectedJson.getJSONObject(i);
        com.alibaba.fastjson.JSONObject actualJsonObj = actualJson.getJSONObject(i);
        org.junit.Assert.assertEquals("Verify Json value is equal.", expectedJsonObj.getString(key), actualJsonObj.getString(key));
    }
}