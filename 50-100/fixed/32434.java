public void saveLanguageTranslation(java.lang.String languageLocale, java.lang.String jsonData) {
    try {
        org.json.JSONObject data = new org.json.JSONObject(jsonData);
        if (data.has("data")) {
            data = data.optJSONObject("data");
        }
        if (data != null) {
            cacheManager.setJsonTranslation(languageLocale, data.toString());
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}