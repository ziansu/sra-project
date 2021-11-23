private static com.vaguehope.onosendai.config.Account parseBufferAccount(final org.json.JSONObject accountJson, final java.lang.String id) throws org.json.JSONException {
    final java.lang.String title = accountJson.optString(com.vaguehope.onosendai.config.Account.KEY_TITLE, null);
    final java.lang.String accessToken = accountJson.getString(com.vaguehope.onosendai.config.Account.KEY_ACCESS_TOKEN);
    return new com.vaguehope.onosendai.config.Account(id, title, AccountProvider.BUFFER, null, null, accessToken, null);
}