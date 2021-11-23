protected static com.liferay.portal.kernel.json.JSONObject createDataJSONObject(java.lang.String... ranges) throws java.lang.Exception {
    com.liferay.portal.kernel.json.JSONObject jsonObject = com.liferay.portal.kernel.json.JSONFactoryUtil.createJSONObject();
    com.liferay.portal.kernel.json.JSONArray jsonArray = com.liferay.portal.kernel.json.JSONFactoryUtil.createJSONArray();
    for (java.lang.String range : ranges) {
        jsonObject = com.liferay.portal.kernel.json.JSONFactoryUtil.createJSONObject();
        jsonObject.put("range", range);
        jsonArray.put(jsonObject);
    }
    jsonObject.put("ranges", jsonArray);
    return jsonObject;
}