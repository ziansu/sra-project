private static com.vaguehope.onosendai.config.Account parseUsernamePasswordLikeAccount(final org.json.JSONObject accountJson, final java.lang.String id, final com.vaguehope.onosendai.config.AccountProvider provider) throws org.json.JSONException {
    final java.lang.String accessToken = accountJson.getString(com.vaguehope.onosendai.config.Account.KEY_USERNAME);
    final java.lang.String accessSecret = accountJson.optString(com.vaguehope.onosendai.config.Account.KEY_PASSWORD);
    final java.lang.String title = accountJson.optString(com.vaguehope.onosendai.config.Account.KEY_TITLE, accessToken);
    return new com.vaguehope.onosendai.config.Account(id, title, provider, null, null, accessToken, accessSecret);
}