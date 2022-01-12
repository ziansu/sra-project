private static com.vaguehope.onosendai.config.Account parseTwitterAccount(final org.json.JSONObject accountJson, final java.lang.String id) throws org.json.JSONException {
    final java.lang.String title = accountJson.optString(com.vaguehope.onosendai.config.Account.KEY_TITLE, null);
    final java.lang.String consumerKey = accountJson.getString(com.vaguehope.onosendai.config.Account.KEY_CONSUMER_KEY);
    final java.lang.String consumerSecret = accountJson.optString(com.vaguehope.onosendai.config.Account.KEY_CONSUMER_SECRET);
    final java.lang.String accessToken = accountJson.getString(com.vaguehope.onosendai.config.Account.KEY_ACCESS_TOKEN);
    final java.lang.String accessSecret = accountJson.optString(com.vaguehope.onosendai.config.Account.KEY_ACCESS_SECRET);
    return new com.vaguehope.onosendai.config.Account(id, title, AccountProvider.TWITTER, consumerKey, consumerSecret, accessToken, accessSecret);
}