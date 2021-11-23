public void saveLanguageTranslation(java.lang.String languageLocale, java.lang.String jsonData) {
    try {
        org.json.JSONObject data = new org.json.JSONObject(jsonData);
        if (data.has("data")) {
            org.json.JSONObject jsonTranslation = data.optJSONObject("data");
            if (jsonTranslation != null) {
                cacheManager.setJsonTranslation(languageLocale, jsonTranslation.toString());
            }
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}