private java.util.List<java.lang.String> getThemesURL() throws com.sciamlab.ckan4j.exception.CKANException, java.io.UnsupportedEncodingException, org.json.JSONException {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (com.sciamlab.common.model.mdr.vocabulary.EUNamedAuthorityDataTheme theme : com.sciamlab.common.model.mdr.EUNamedAuthorityVocabularyMap.<com.sciamlab.common.model.mdr.vocabulary.EUNamedAuthorityDataTheme>get(EUNamedAuthorityVocabulary.DATA_THEME).values()) {
        java.lang.String url = "/dataset?groups=" + (java.net.URLEncoder.encode(theme.authority_code, "UTF-8"));
        list.add(url);
    }
    return list;
}